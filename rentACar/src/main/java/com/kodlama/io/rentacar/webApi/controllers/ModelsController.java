package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.ModelService;
import com.kodlama.io.rentacar.business.requests.CreateModelRequest;
import com.kodlama.io.rentacar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/models")
public class ModelsController {
    ModelService modelService;

    @PostMapping
    public void add(CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @GetMapping
    public List<GetAllModelsResponse> getAll() {
        return this.modelService.getAll();
    }
}
