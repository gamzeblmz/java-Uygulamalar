package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.CorporateCustomerService;
import com.kodlama.io.rentacar.business.requests.CreateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllCorporateCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdCorporateCustomerResponse;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.CorporateCustomerRepository;
import com.kodlama.io.rentacar.entities.concretes.CorporateCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CorporateCustomerManager implements CorporateCustomerService {

    private CorporateCustomerRepository corporateCustomerRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllCorporateCustomerResponse> getAll() {
        List<CorporateCustomer> corporateCustomers = corporateCustomerRepository.findAll();
        List<GetAllCorporateCustomerResponse> getAllCorporateCustomerResponses= corporateCustomers.stream()
                .map(corporateCustomer -> this.modelMapperService.forResponse()
                        .map(corporateCustomer,GetAllCorporateCustomerResponse.class)).collect(Collectors.toList());
        return getAllCorporateCustomerResponses;
    }

    @Override
    public void add(CreateCorporateCustomerRequest createCorporateCustomerRequest) {
        CorporateCustomer customer =this.modelMapperService.forRequest()
                .map(createCorporateCustomerRequest,CorporateCustomer.class);
        corporateCustomerRepository.save(customer);
    }

    @Override
    public GetByIdCorporateCustomerResponse getById(int id) {
        CorporateCustomer customer= this.corporateCustomerRepository.findById(id).orElseThrow();
        GetByIdCorporateCustomerResponse response = this.modelMapperService.forResponse()
                .map(customer,GetByIdCorporateCustomerResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        this.corporateCustomerRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        CorporateCustomer customer =this.modelMapperService.forRequest()
                .map(updateCorporateCustomerRequest,CorporateCustomer.class);
        corporateCustomerRepository.save(customer);
    }
}
