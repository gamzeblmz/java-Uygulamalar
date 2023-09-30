package com.kodlama.io.rentacar.dataAccess.abstracts;

import com.kodlama.io.rentacar.entities.concretes.Colour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColourRepository extends JpaRepository<Colour, Integer> {
}
