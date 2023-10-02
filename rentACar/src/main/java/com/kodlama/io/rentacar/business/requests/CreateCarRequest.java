package com.kodlama.io.rentacar.business.requests;


import com.kodlama.io.rentacar.core.utilities.enums.MaintenanceStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    private String plate;
    private double dailyPrice;
    private int modelYear;
    private int state;
    private int modelId;
    private String maintanence;
}
