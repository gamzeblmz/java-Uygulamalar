package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.IndividualCustomerService;
import com.kodlama.io.rentacar.business.requests.CreateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.requests.UpdateIndividualCustomerRequest;
import com.kodlama.io.rentacar.business.responses.GetAllIndividualCustomerResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdIndividualCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/individuals")
public class IndividualCustomerController {

    private IndividualCustomerService individualCustomerService;
    @GetMapping
    public List<GetAllIndividualCustomerResponse> getAll() {
        return this.individualCustomerService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdIndividualCustomerResponse getById(@PathVariable int id) {
        return this.individualCustomerService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        this.individualCustomerService.add(createIndividualCustomerRequest);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void update(@RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        this.individualCustomerService.update(updateIndividualCustomerRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable int id) {
        this.individualCustomerService.delete(id);
    }
}
