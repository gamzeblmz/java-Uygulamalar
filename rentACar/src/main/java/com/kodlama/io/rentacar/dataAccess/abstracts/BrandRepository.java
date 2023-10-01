package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    boolean existsByName(String name);
}
