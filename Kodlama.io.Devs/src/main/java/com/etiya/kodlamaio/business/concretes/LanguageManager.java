package com.etiya.kodlamaio.business.concretes;

import com.etiya.kodlamaio.business.abstracts.LanguageService;
import com.etiya.kodlamaio.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaio.business.requests.UpdateLanguageRequest;
import com.etiya.kodlamaio.business.responses.GetAllLanguageResponse;
import com.etiya.kodlamaio.business.responses.GetByIdLanguageResponse;

import java.util.List;

public class LanguageManager implements LanguageService {
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
