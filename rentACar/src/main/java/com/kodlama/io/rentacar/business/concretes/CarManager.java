package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.CarService;
import com.kodlama.io.rentacar.business.requests.CreateCarRequest;
import com.kodlama.io.rentacar.business.requests.UpdateCarRequest;
import com.kodlama.io.rentacar.business.responses.GetAllCarResponse;
import com.kodlama.io.rentacar.business.responses.GetByIdCarResponse;
import com.kodlama.io.rentacar.business.rules.CarBusinessRules;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.CarRepository;
import com.kodlama.io.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private ModelMapperService modelMapperService;
    private CarRepository carRepository;
    private CarBusinessRules carBusinessRules;
    @Override
    public void add(CreateCarRequest createCarRequest) {
        this.carBusinessRules.checkIfCarPlateExists(createCarRequest.getPlate());
        Car car = this.modelMapperService.forRequest().map(createCarRequest, Car.class);
        this.carRepository.save(car);
    }

    public List<GetAllCarResponse> getAll() {
        List<Car> cars = this.carRepository.findAll();
        List<GetAllCarResponse> carResponses = cars.stream().map(car ->
                        this.modelMapperService.forResponse().map(car, GetAllCarResponse.class)).
                collect(Collectors.toList());
        return carResponses;
    }

    @Override
    public void delete(int id) {
        this.carRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car car = this.modelMapperService.forRequest().map(updateCarRequest, Car.class);
        this.carRepository.save(car);
    }

    @Override
    public GetByIdCarResponse getById(int id) {
        Car car = this.carRepository.findById(id).orElseThrow();
        GetByIdCarResponse getByIdCarResponse = this.modelMapperService.forResponse().map(car, GetByIdCarResponse.class);
        return getByIdCarResponse;
    }
}
