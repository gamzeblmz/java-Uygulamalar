package com.kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByIdRentalResponse {
    private int id;
    private Date startedDate;
    private double dailyPrice;
    private int rentedForDays;
    private String plate;
    private boolean paid;
}
