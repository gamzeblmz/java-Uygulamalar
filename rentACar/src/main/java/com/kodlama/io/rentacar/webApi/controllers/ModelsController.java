package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.ModelService;
import com.kodlama.io.rentacar.business.requests.CreateModelRequest;
import com.kodlama.io.rentacar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/models")
public class ModelsController {
    ModelService modelService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody  @Valid() CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @GetMapping
    public List<GetAllModelsResponse> getAll() {
        return this.modelService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        modelService.delete(id);
    }
}
