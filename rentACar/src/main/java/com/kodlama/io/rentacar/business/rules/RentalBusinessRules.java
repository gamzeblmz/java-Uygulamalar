package com.kodlama.io.rentacar.business.rules;

import com.kodlama.io.rentacar.core.utilities.exception.BusinessException;
import com.kodlama.io.rentacar.dataAccess.abstracts.CarRepository;
import com.kodlama.io.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RentalBusinessRules {
    private CarRepository carRepository;

    public boolean checkIfCarAvailable(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        if (car.getState() == 1) {
            return true;
        }
        throw new BusinessException("Car not avaible");
    }
}
