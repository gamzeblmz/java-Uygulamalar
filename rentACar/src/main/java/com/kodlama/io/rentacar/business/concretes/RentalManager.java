package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.BankService;
import com.kodlama.io.rentacar.business.abstracts.ModelService;
import com.kodlama.io.rentacar.business.abstracts.RentalService;
import com.kodlama.io.rentacar.business.requests.CreateRentalRequest;
import com.kodlama.io.rentacar.business.requests.UpdateRentalRequest;
import com.kodlama.io.rentacar.business.responses.GetAllMaintenanceResponse;
import com.kodlama.io.rentacar.business.responses.GetAllRentalResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdRentalResponse;
import com.kodlama.io.rentacar.business.rules.RentalBusinessRules;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.CarRepository;
import com.kodlama.io.rentacar.dataAccess.abstracts.PaymanentRepository;
import com.kodlama.io.rentacar.dataAccess.abstracts.RentalRepository;
import com.kodlama.io.rentacar.entities.concretes.Car;
import com.kodlama.io.rentacar.entities.concretes.Maintenance;
import com.kodlama.io.rentacar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {

    private BankService bankService;
    private ModelMapperService modelMapperService;
    private RentalRepository rentalRepository;
    private PaymanentRepository paymanentRepository;
    private RentalBusinessRules rentalBusinessRules;
    @Override
    public List<GetAllRentalResponse> getAll() {
        List<Rental> rentals = this.rentalRepository.findAll();
        List<GetAllRentalResponse> getAllRentalResponses = rentals.stream().map(rental -> this.modelMapperService.forResponse()
                .map(rental, GetAllRentalResponse.class)).collect(Collectors.toList());
        return getAllRentalResponses;
    }

    @Override
    public void add(CreateRentalRequest createRentalRequest) {
        if(rentalBusinessRules.checkIfCarAvailable(createRentalRequest.getCarId())){
            Rental rental = modelMapperService.forRequest().map(createRentalRequest, Rental.class);
            rental.setStartedDate(new Date());
            rentalRepository.save(rental);
        }

    }

    @Override
    public GetByIdRentalResponse getById(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetByIdRentalResponse getByIdRentalsResponse = modelMapperService.forResponse()
                .map(rental, GetByIdRentalResponse.class);
        return getByIdRentalsResponse;
    }

    @Override
    public void update(UpdateRentalRequest updateRentalRequest) {
        Rental rentals = modelMapperService.forRequest().map(updateRentalRequest, Rental.class);
        rentalRepository.save(rentals);
    }

    @Override
    public void delete(int id) {
        rentalRepository.deleteById(id);
    }
}
