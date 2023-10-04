package com.kodlama.io.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {
    private int id;
    private double dailyPrice;
    private int rentedForDays;
    private String plate;
}
