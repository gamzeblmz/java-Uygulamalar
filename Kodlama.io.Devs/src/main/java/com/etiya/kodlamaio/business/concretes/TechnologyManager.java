package com.etiya.kodlamaio.business.concretes;

import com.etiya.kodlamaio.business.abstracts.TechnologyService;
import com.etiya.kodlamaio.business.requests.CreateTechnologyRequest;
import com.etiya.kodlamaio.business.requests.UpdateTechnologyRequest;
import com.etiya.kodlamaio.business.responses.GetAllTechnologyResponse;
import com.etiya.kodlamaio.business.responses.GetByIdTechnologyResponse;
import com.etiya.kodlamaio.core.utilities.mappers.ModelMapperService;
import com.etiya.kodlamaio.dataAccess.abstracts.TechnologyRepository;
import com.etiya.kodlamaio.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = this.modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = this.technologyRepository.findAll();
        List<GetAllTechnologyResponse> getAllTechnologyResponses = technologies.stream().map(technology -> this.modelMapperService
                .forResponse().map(technology, GetAllTechnologyResponse.class)).collect(Collectors.toList());
        return getAllTechnologyResponses;
    }

    @Override
    public GetByIdTechnologyResponse getById(int id) {
        Technology technology = this.technologyRepository.findById(id).orElseThrow();
        GetByIdTechnologyResponse getByIdTechnologyResponse = this.modelMapperService.forResponse()
                .map(technology, GetByIdTechnologyResponse.class);
        return getByIdTechnologyResponse;
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = this.modelMapperService.forRequest()
                .map(updateTechnologyRequest, Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
        this.technologyRepository.deleteById(id);
    }
}
