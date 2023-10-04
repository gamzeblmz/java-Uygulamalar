package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.Paymanent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymanentRepository extends JpaRepository<Paymanent, Integer> {
}
