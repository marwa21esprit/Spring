package com.example.demo.entities;
import com.example.demo.enums.TypeChef;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "ChefCuisinier")

public class ChefCuisinier implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChefCuisinier")
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
// Constructeur et accesseurs (getters) et mutateurs (setters)

}
