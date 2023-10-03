package com.kodlama.io.rentacar.entities.concretes;

import com.kodlama.io.rentacar.entities.abstracts.enums.MaintenanceStatus;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private MaintenanceStatus status;

}
