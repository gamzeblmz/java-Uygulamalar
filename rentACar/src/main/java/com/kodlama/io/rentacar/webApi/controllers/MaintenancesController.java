package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.MaintenanceService;
import com.kodlama.io.rentacar.business.requests.CreateMaintenanceRequest;
import com.kodlama.io.rentacar.business.responses.GetAllMaintenanceResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/maintenances")
public class MaintenancesController {

    private MaintenanceService maintenanceService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateMaintenanceRequest createMaintenanceRequest) {
        this.maintenanceService.add(createMaintenanceRequest);
    }

    @GetMapping("getAll")
    public List<GetAllMaintenanceResponse> getAll() {
        return this.maintenanceService.getAll();
    }
}
