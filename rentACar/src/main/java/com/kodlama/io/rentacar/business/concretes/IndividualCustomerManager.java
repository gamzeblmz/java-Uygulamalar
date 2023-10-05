package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.IndividualCustomerService;
import com.kodlama.io.rentacar.business.requests.CreateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllIndividualCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdIndividualCustomerResponse;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.IndividualCustomerRepository;
import com.kodlama.io.rentacar.entities.concretes.IndividualCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IndividualCustomerManager implements IndividualCustomerService {

    private ModelMapperService modelMapperService;
    private IndividualCustomerRepository individualCustomerRepository;


    @Override
    public List<GetAllIndividualCustomerResponse> getAll() {
        List<IndividualCustomer> individualCustomers = individualCustomerRepository.findAll();
        List<GetAllIndividualCustomerResponse> customerResponses = individualCustomers.stream()
                .map(individualCustomer -> this.modelMapperService.forResponse()
                        .map(individualCustomer, GetAllIndividualCustomerResponse.class)).collect(Collectors.toList());
        return customerResponses;
    }

    @Override
    public void add(CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        IndividualCustomer customer = this.modelMapperService.forRequest()
                .map(createIndividualCustomerRequest, IndividualCustomer.class);
        individualCustomerRepository.save(customer);
    }

    @Override
    public GetByIdIndividualCustomerResponse getById(int id) {
        IndividualCustomer customer = individualCustomerRepository.findById(id).orElseThrow();
        GetByIdIndividualCustomerResponse customerResponse = this.modelMapperService.forResponse().map(customer, GetByIdIndividualCustomerResponse.class);
        return customerResponse;
    }

    @Override
    public void delete(int id) {
        this.individualCustomerRepository.deleteById(id);
    }

    @Override
    public void update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        IndividualCustomer customer = this.modelMapperService.forRequest()
                .map(updateIndividualCustomerRequest, IndividualCustomer.class);
        individualCustomerRepository.save(customer);
    }
}
