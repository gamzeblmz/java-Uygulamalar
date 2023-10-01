package com.etiya.kodlamaio.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateTechnologyRequest {
    int id;
    String name;
}
