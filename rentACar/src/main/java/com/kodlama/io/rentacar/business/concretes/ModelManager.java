package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.ModelService;
import com.kodlama.io.rentacar.business.requests.CreateModelRequest;
import com.kodlama.io.rentacar.business.responses.GetAllModelsResponse;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.ModelRepository;
import com.kodlama.io.rentacar.entities.concretes.Brand;
import com.kodlama.io.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = this.modelRepository.findAll();
        List<GetAllModelsResponse> getAllModelsResponses = models.stream().map(model -> modelMapperService.forResponse()
                .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
        return getAllModelsResponses;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        //Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        Model model = new Model();
        model.setBrand(new Brand());
        model.getBrand().setId(createModelRequest.getBrandId());
        model.setName(createModelRequest.getName());
        this.modelRepository.save(model);
    }

    @Override
    public void delete(int id) {
        this.modelRepository.deleteById(id);
    }

}
