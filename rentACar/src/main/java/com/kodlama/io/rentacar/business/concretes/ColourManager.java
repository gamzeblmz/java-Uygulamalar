package com.kodlama.io.rentacar.business.concretes;


import com.kodlama.io.rentacar.business.abstracts.ColourService;
import com.kodlama.io.rentacar.business.requests.CreateColourRequest;
import com.kodlama.io.rentacar.business.requests.UpdateColourRequest;
import com.kodlama.io.rentacar.business.responses.GetAllColoursResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdColoursResponse;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.ColourRepository;
import com.kodlama.io.rentacar.entities.concretes.Colour;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ColourManager implements ColourService {

    private ColourRepository colourRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateColourRequest createColourRequest) {
        Colour colour = modelMapperService.forRequest().map(createColourRequest, Colour.class);
        colourRepository.save(colour);

    }

    @Override
    public void update(UpdateColourRequest updateColourRequest) {
        Colour colour = modelMapperService.forRequest().map(updateColourRequest, Colour.class);
        colourRepository.save(colour);
    }

    @Override
    public void delete(int id) {
        colourRepository.deleteById(id);
    }

    @Override
    public GetByIdColoursResponse getById(int id) {
        Colour colour = colourRepository.getById(id);
        GetByIdColoursResponse getByIdColoursResponse = modelMapperService.forResponse().map(colour, GetByIdColoursResponse.class);
        return getByIdColoursResponse;
    }

    @Override
    public List<GetAllColoursResponse> getAll() {
        List<Colour> colourList = colourRepository.findAll();

        List<GetAllColoursResponse> getAllColoursResponses = colourList.stream().
                map(colour -> modelMapperService.forResponse().map(colour, GetAllColoursResponse.class)).collect(Collectors.toList());
        return getAllColoursResponses;
    }
}