package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllIndividualCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdIndividualCustomerResponse;

import java.util.List;

public interface IndividualCustomerService {
    public List<GetAllIndividualCustomerResponse> getAll();

    void add(CreateIndividualCustomerRequest createIndividualCustomerRequest);

    GetByIdIndividualCustomerResponse getById(int id);

    void delete(int id);

    void update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);
}
