package com.kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "paymanents")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paymanent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "paymanentDate", updatable = false)
    private Date paymanentDate;

    @Column(name = "totalPrice")
    private double totalPrice;

    @OneToOne(mappedBy = "rental_id")
    private Rental rental;


}
