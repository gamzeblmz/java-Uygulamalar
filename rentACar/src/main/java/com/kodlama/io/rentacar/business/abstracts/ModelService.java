package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
}
