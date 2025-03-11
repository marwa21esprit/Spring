package com.example.demo.service;

import com.example.demo.entities.ChefCuisinier;

import java.util.List;
public interface IChefCuisinerService  {
    ChefCuisinier save(ChefCuisinier chefCuisinier);
    ChefCuisinier update(ChefCuisinier chefCuisinier);
    void delete(Long id);
    ChefCuisinier findById(Long id);
    List<ChefCuisinier> findAll();
}
