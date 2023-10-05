package com.kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="individualCustomers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IndividualCustomer extends BaseCustomer {

    @Column(name="firstName")
    private String firstName;

    @Column(name = "lasName")
    private String lastName;

    @Column(name="nationalId",unique = true)
    private String nationalId;

}
