package com.kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Brand")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand {
    @Id
    int id;
    String name;
}
