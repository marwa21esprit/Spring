package com.example.demo.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient; // Clé primaire
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;
    // @Transient attribut non persisté
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @OneToMany(mappedBy="client")
    private Set<Commande> commandes;
}
