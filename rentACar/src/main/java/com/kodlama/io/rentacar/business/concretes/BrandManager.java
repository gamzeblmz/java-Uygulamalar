package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.BrandService;
import com.kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import com.kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import com.kodlama.io.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands= brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses= new ArrayList<>();
        return getAllBrandsResponses;
    }
}
