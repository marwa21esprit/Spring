package com.example.demo.service;

import com.example.demo.entities.Composant;

import java.util.List;

public interface IComposantService {
    Composant save(Composant composant);
    Composant update(Composant composant);
    void delete(Long id);
    Composant findById(Long id);
    List<Composant> findAll();
}
