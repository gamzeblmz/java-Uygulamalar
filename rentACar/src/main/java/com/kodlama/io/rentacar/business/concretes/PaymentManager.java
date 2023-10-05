package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.BankService;
import com.kodlama.io.rentacar.business.abstracts.PaymentService;
import com.kodlama.io.rentacar.business.requests.CreatePaymentRequest;
import com.kodlama.io.rentacar.business.rules.PaymentBusinessRules;
import com.kodlama.io.rentacar.core.utilities.exception.BusinessException;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.PaymanentRepository;
import com.kodlama.io.rentacar.dataAccess.abstracts.RentalRepository;
import com.kodlama.io.rentacar.entities.concretes.Paymanent;
import com.kodlama.io.rentacar.entities.concretes.Rental;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
    ModelMapperService modelMapperService;
    PaymanentRepository paymentRepository;
    BankService bankService;
    RentalRepository rentalRepository;
    PaymentBusinessRules paymentBusinessRules;


    @Transactional
    @Override
    public void pay(CreatePaymentRequest createPaymentRequest) {
        if (bankService.cardPaymanent(createPaymentRequest.getCardDetail())) {
            Paymanent payment = modelMapperService.forRequest().map(createPaymentRequest, Paymanent.class);
            double totalPrice = paymentBusinessRules.calculateTotalPrice(createPaymentRequest.getRentalId());
            payment.setTotalPrice(totalPrice);
            paymentRepository.save(payment);

            Rental rental = rentalRepository.findById(createPaymentRequest.getRentalId()).orElseThrow();
            rental.setPaid(true);
            rental.getCar().setState(2);
            rentalRepository.save(rental);
        } else {
            throw new BusinessException("Payment could not be received");
        }
    }


}
