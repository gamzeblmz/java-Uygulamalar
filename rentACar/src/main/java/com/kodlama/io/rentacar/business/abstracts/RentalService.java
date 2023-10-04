package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateRentalRequest;
import com.kodlama.io.rentacar.business.requests.UpdateRentalRequest;
import com.kodlama.io.rentacar.business.responses.GetAllRentalResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdRentalResponse;

import java.util.List;

public interface RentalService {
    List<GetAllRentalResponse> getAll();

    void add(CreateRentalRequest createRentalRequest);
    GetByIdRentalResponse getById(int id);
    void update(UpdateRentalRequest updateRentalRequest);
    public void delete(int id);

}
