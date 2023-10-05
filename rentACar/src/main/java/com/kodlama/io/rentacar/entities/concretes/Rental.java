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

    @Column(name = "rantedForDays")
    private int rantedForDays;

    @Column(name = "startedDate")
    private Date startedDate;

    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;

    @OneToOne(mappedBy = "rental")
    private Paymanent payment;

    @Column(name = "paid")
    boolean paid = false;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @ManyToOne()
    @JoinColumn(name="rental_id")
    private BaseCustomer baseCustomer;

}
