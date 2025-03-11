package com.example.demo.service;

import com.example.demo.entities.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    DetailComposant save(DetailComposant detailComposant);
    DetailComposant update(DetailComposant detailComposant);
    void delete(Long id);
    DetailComposant findById(Long id);
    List<DetailComposant> findAll();
}
