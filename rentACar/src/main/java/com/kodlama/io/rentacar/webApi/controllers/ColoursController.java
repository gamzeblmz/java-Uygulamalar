package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.ColourService;
import com.kodlama.io.rentacar.business.requests.CreateColourRequest;
import com.kodlama.io.rentacar.business.requests.UpdateColourRequest;
import com.kodlama.io.rentacar.business.responses.GetAllColoursResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdColoursResponse;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colours")
public class ColoursController {
    ColourService colourService;

    @PostMapping()
    public void add(@RequestBody CreateColourRequest createColourRequest) {
        colourService.add(createColourRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateColourRequest updateColourRequest) {
        colourService.update(updateColourRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        colourService.delete(id);
    }

    @GetMapping("/{id}")
    public GetByIdColoursResponse getById(@PathVariable int id) {
        return colourService.getById(id);
    }

    @GetMapping()
    public List<GetAllColoursResponse> getAll() {
        return colourService.getAll();
    }

}