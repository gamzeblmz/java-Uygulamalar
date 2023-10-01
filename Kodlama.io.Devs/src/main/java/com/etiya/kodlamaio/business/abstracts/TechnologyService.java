package com.etiya.kodlamaio.business.abstracts;

import com.etiya.kodlamaio.business.requests.CreateTechnologyRequest;
import com.etiya.kodlamaio.business.requests.UpdateTechnologyRequest;
import com.etiya.kodlamaio.business.responses.GetAllTechnologyResponse;
import com.etiya.kodlamaio.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    void add(CreateTechnologyRequest createTechnologyRequest);

    List<GetAllTechnologyResponse> getAll();

    GetByIdTechnologyResponse getById(int id);

    void update(UpdateTechnologyRequest updateTechnologyRequest);

    void delete(int id);
}
