package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer,Integer> {
}
