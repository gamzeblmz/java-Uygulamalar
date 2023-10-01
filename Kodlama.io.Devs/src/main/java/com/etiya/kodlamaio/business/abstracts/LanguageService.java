package com.etiya.kodlamaio.business.abstracts;

import com.etiya.kodlamaio.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaio.business.requests.UpdateLanguageRequest;
import com.etiya.kodlamaio.business.responses.GetAllLanguageResponse;
import com.etiya.kodlamaio.business.responses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguageService {
    void add(CreateLanguageRequest createLanguageRequest);

    List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getById(int id);

    void update(UpdateLanguageRequest updateLanguageRequest);

    void delete(int id);

}
