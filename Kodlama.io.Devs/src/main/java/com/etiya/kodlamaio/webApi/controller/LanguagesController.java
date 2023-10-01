package com.etiya.kodlamaio.webApi.controller;

import com.etiya.kodlamaio.business.abstracts.LanguageService;
import com.etiya.kodlamaio.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaio.business.requests.UpdateLanguageRequest;
import com.etiya.kodlamaio.business.responses.GetAllLanguageResponse;
import com.etiya.kodlamaio.business.responses.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
@AllArgsConstructor
public class LanguagesController {
    private LanguageService languageService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateLanguageRequest createLanguageRequest) {
        this.languageService.add(createLanguageRequest);
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll() {
        return this.languageService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id) {
        return this.languageService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.languageService.delete(id);
    }
}
