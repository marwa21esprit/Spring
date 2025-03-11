package com.example.demo.service;
import com.example.demo.entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande save(Commande commande);
    Commande update(Commande commande);
    void delete(Long id);
    Commande findById(Long id);
    List<Commande> findAll();
}
