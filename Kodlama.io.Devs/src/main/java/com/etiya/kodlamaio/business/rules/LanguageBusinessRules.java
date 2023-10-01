package com.etiya.kodlamaio.business.rules;

import com.etiya.kodlamaio.dataAccess.abstracts.LanguageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LanguageBusinessRules extends RuntimeException {
    LanguageRepository languageRepository;

    public void checkIfLanguageNameExist(String name) {
        if (languageRepository.existsByName(name)) {
            throw new RuntimeException("Language already exist");
        }
    }

}
