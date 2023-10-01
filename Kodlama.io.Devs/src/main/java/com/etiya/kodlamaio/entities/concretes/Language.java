package com.etiya.kodlamaio.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "language")
    private List<Technology> technologies;

}
