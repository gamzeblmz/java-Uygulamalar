package com.kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "maintenances")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sendDate")
    private Date sendDate;

    @Column(name = "returnDate")
    private Date returnDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
