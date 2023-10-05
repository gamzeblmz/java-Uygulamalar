package com.kodlama.io.rentacar.business.rules;

import com.kodlama.io.rentacar.core.utilities.exception.BusinessException;
import com.kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    BrandRepository brandRepository;
    public void checkIfBrandNameExist(String name) {
        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand already exists");
        }
    }
}
