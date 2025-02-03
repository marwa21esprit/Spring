package com.example.demo.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table( name = "ChaineRestauration")
public class ChaineRestauration implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChaineRestoration")
    private Long idChaineRestoration; // Clé primaire
    private String libelle;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCreation;

    @OneToMany(mappedBy="chaineRestauration")
    private Set<Restaurant> restaurants;
}
