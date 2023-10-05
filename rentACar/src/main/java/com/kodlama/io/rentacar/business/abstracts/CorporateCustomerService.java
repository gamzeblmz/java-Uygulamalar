package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllCorporateCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdCorporateCustomerResponse;

import java.util.List;

public interface CorporateCustomerService {
    public List<GetAllCorporateCustomerResponse> getAll();
    void add(CreateCorporateCustomerRequest createCorporateCustomerRequest);

    GetByIdCorporateCustomerResponse getById(int id);

    void delete(int id);

    void update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
}
