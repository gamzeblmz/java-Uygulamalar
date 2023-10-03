package com.kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMaintenanceResponse {
    private int id;
    private String carPlate;
    private Date sendDate;
    private Date returnDate;
}
