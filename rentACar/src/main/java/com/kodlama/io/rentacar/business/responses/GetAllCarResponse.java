package com.kodlama.io.rentacar.business.responses;

import com.kodlama.io.rentacar.entities.abstracts.enums.MaintenanceStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarResponse {
    private int id;
    private String plate;
    private double dailyPrice;
    private int modelYear;
    private int state;
    private String modelName;
    private MaintenanceStatus status;
}
