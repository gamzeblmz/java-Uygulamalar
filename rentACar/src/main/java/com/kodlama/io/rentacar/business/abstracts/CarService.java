package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateCarRequest;
import com.kodlama.io.rentacar.business.requests.UpdateCarRequest;
import com.kodlama.io.rentacar.business.responses.GetAllCarResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {
    void add(CreateCarRequest createCarRequest);
    List<GetAllCarResponse> getAll();
    void delete(int id);
    void update(UpdateCarRequest updateCarRequest);
    GetByIdCarResponse getById(int id);
}
