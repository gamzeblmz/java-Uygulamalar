package com.etiya.kodlamaio.dataAccess.abstracts;

import com.etiya.kodlamaio.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
}
