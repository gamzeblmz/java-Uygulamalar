package com.etiya.kodlamaio.business.concretes;

import com.etiya.kodlamaio.business.abstracts.LanguageService;
import com.etiya.kodlamaio.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaio.business.requests.UpdateLanguageRequest;
import com.etiya.kodlamaio.business.responses.GetAllLanguageResponse;
import com.etiya.kodlamaio.business.responses.GetByIdLanguageResponse;
import com.etiya.kodlamaio.core.utilities.mappers.ModelMapperService;
import com.etiya.kodlamaio.dataAccess.abstracts.LanguageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        return null;
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {

    }

    @Override
    public void delete(int id) {

    }
}
