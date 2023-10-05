package com.kodlama.io.rentacar.business.rules;

import com.kodlama.io.rentacar.core.utilities.exception.BusinessException;
import com.kodlama.io.rentacar.dataAccess.abstracts.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarBusinessRules {
    private CarRepository carRepository;

    public void checkIfCarPlateExists(String plate) {
        if (this.carRepository.existsByPlate(plate)) {
            throw new BusinessException("Car plate already exist");// java exception types
        }
    }
}
