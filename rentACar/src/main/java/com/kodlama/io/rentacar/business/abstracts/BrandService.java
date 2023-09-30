package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();

}
