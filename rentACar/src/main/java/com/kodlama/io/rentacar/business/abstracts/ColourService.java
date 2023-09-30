package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateColourRequest;
import com.kodlama.io.rentacar.business.requests.UpdateColourRequest;
import com.kodlama.io.rentacar.business.responses.GetAllColoursResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdColoursResponse;

import java.util.List;

public interface ColourService {
    void add(CreateColourRequest createColourRequest);

    void update(UpdateColourRequest updateColourRequest);

    void delete(int id);

    GetByIdColoursResponse getById(int id);

    List<GetAllColoursResponse> getAll();
}
