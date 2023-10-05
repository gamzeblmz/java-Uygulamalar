package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Integer> {
}
