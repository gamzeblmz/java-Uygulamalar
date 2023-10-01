package com.etiya.kodlamaio.webApi.controller;

import com.etiya.kodlamaio.business.abstracts.TechnologyService;
import com.etiya.kodlamaio.business.requests.CreateTechnologyRequest;
import com.etiya.kodlamaio.business.requests.UpdateTechnologyRequest;
import com.etiya.kodlamaio.business.responses.GetAllTechnologyResponse;
import com.etiya.kodlamaio.business.responses.GetByIdTechnologyResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
@AllArgsConstructor
public class TechnologiesController {
    private TechnologyService technologyService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse> getAll() {
        return this.technologyService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdTechnologyResponse getById(@PathVariable int id) {
        return this.technologyService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) {
        this.technologyService.update(updateTechnologyRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.technologyService.delete(id);
    }
}
