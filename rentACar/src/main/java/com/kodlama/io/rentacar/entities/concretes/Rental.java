package com.kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "rentals")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "startedDate", updatable = false)
    private Date startedDate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "rentedForDays")
    private int rentedForDays;

    @Column(name = "paid")
    boolean paid = false;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToOne
    @JoinColumn(name = "rental")
    private Paymanent paymanent;
}
