package com.kodlama.io.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
    private int id;
    private String plate;
    private double dailyPrice;
    private int modelYear;
    private int state;
    private int modelId;
}
