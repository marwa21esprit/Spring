package com.example.demo.service;

import com.example.demo.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {
    Restaurant save(Restaurant restaurant);
    Restaurant update(Restaurant restaurant);
    void delete(Long id);
    Restaurant findById(Long id);
    List<Restaurant> findAll();
}
