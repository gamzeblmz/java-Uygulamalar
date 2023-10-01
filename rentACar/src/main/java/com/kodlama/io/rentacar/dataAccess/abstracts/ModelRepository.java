package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
