package com.example.demo.entities;
import com.example.demo.enums.TypeMenu;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Menu")

public class Menu implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idMenu")
    private Long idMenu;
    private String libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private Float prixTotal;
// Constructeur et accesseurs (getters) et mutateurs (setters)

}
