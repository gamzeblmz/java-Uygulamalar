package com.kodlama.io.rentacar.business.responses;

import com.kodlama.io.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllRentalResponse {
    private int id;
    private Date startedDate;
    private double dailyPrice;
    private int rentedForDays;
    private String plate;
    private boolean paid;
    private int customerId;
}
