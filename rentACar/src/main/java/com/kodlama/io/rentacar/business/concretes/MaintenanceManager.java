package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.MaintenanceService;
import com.kodlama.io.rentacar.business.requests.CreateMaintenanceRequest;
import com.kodlama.io.rentacar.business.requests.UpdateMaintenanceRequest;
import com.kodlama.io.rentacar.business.responses.GetAllMaintenanceResponse;
import com.kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import com.kodlama.io.rentacar.dataAccess.abstracts.CarRepository;
import com.kodlama.io.rentacar.dataAccess.abstracts.MaintenanceRepository;
import com.kodlama.io.rentacar.entities.concretes.Car;
import com.kodlama.io.rentacar.entities.concretes.Maintenance;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MaintenanceManager implements MaintenanceService {

    private MaintenanceRepository maintenanceRepository;
    private CarRepository carRepository;
    private ModelMapperService modelMapperService;

    @Transactional
    @Override
    public void add(CreateMaintenanceRequest createMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(createMaintenanceRequest, Maintenance.class);
        this.maintenanceRepository.save(maintenance);

        Car car = this.carRepository.findById(createMaintenanceRequest.getCarId()).orElseThrow();
        car.setState(3);
        this.carRepository.save(car);
    }

    @Override
    public List<GetAllMaintenanceResponse> getAll() {
        List<Maintenance> maintenances = this.maintenanceRepository.findAll();
        List<GetAllMaintenanceResponse> getAllMaintenanceResponses = maintenances.stream().map(maintenance -> this.modelMapperService.forResponse()
                .map(maintenance, GetAllMaintenanceResponse.class)).collect(Collectors.toList());
        return getAllMaintenanceResponses;
    }

    @Override
    @Transactional
    public void update(UpdateMaintenanceRequest updateMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(updateMaintenanceRequest, Maintenance.class);
        this.maintenanceRepository.save(maintenance);

        Car car = carRepository.findById(updateMaintenanceRequest.getCarId()).orElseThrow();
        car.setState(1);
        this.carRepository.save(car);
    }


}
