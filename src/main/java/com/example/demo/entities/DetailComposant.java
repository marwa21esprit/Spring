package com.example.demo.entities;

import com.example.demo.enums.TypeComposant;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailComposant")

public class DetailComposant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailComposant")
    private Long idDetailComposant;
    private Float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
// Constructeur et accesseurs (getters) et mutateurs (setters)

}
