package com.etiya.kodlamaio.dataAccess.abstracts;

import com.etiya.kodlamaio.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
