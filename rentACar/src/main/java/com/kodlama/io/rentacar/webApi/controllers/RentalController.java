package com.kodlama.io.rentacar.webApi.controllers;


import com.kodlama.io.rentacar.business.abstracts.RentalService;
import com.kodlama.io.rentacar.business.requests.CreateRentalRequest;
import com.kodlama.io.rentacar.business.requests.UpdateRentalRequest;
import com.kodlama.io.rentacar.business.responses.GetAllRentalResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdRentalResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rentals")
@AllArgsConstructor
public class RentalController {
    private RentalService rentalService;

    @GetMapping()
    public List<GetAllRentalResponse> getAll(){
        return rentalService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateRentalRequest createRentalRequest){
        rentalService.add(createRentalRequest);
    }

    @GetMapping(value = "/{id}")
    public GetByIdRentalResponse getById(@PathVariable int id){
        return rentalService.getById(id);
    }

    @PutMapping(value = "path/{id}")
    public void update(@RequestBody UpdateRentalRequest updateRentalRequest){
        rentalService.update(updateRentalRequest);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        rentalService.delete(id);
    }
}
