package com.kodlama.io.rentacar.business.rules;

import com.kodlama.io.rentacar.dataAccess.abstracts.RentalRepository;
import com.kodlama.io.rentacar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentBusinessRules {
    private RentalRepository rentalRepository;

    public double calculateTotalPrice(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        double totalPrice = rental.getRantedForDays() * rental.getDailyPrice();
        return totalPrice;
    }

}
