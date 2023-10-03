package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateMaintenanceRequest;
import com.kodlama.io.rentacar.business.requests.UpdateMaintenanceRequest;
import com.kodlama.io.rentacar.business.responses.GetAllMaintenanceResponse;

import java.util.List;

public interface MaintenanceService {
    void add(CreateMaintenanceRequest createMaintenanceRequest);
    List<GetAllMaintenanceResponse> getAll();
    void update(UpdateMaintenanceRequest updateMaintenanceRequest);
}
