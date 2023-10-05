package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.CorporateCustomerService;
import com.kodlama.io.rentacar.business.requests.CreateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateCorporateCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllCorporateCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdCorporateCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/corporates")
public class CorporateCustomerController {

    private CorporateCustomerService corporateCustomerService;

    @GetMapping
    public List<GetAllCorporateCustomerResponse> getAll() {
        return this.corporateCustomerService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCorporateCustomerResponse getById(@PathVariable int id) {
        return this.corporateCustomerService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCorporateCustomerRequest createCorporateCustomerRequest) {
        this.corporateCustomerService.add(createCorporateCustomerRequest);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void update(@RequestBody UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        this.corporateCustomerService.update(updateCorporateCustomerRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable int id) {
        this.corporateCustomerService.delete(id);
    }
}
