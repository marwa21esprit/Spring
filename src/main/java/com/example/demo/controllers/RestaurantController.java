package com.example.demo.controllers;

import com.example.demo.service.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Menu;
import com.example.demo.entities.Restaurant;
import com.example.demo.enums.TypeMenu;
import com.example.demo.repository.RestaurantRepo;


import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Restaurant")

public class RestaurantController {
    private IRestaurantService restaurantService;

    IRestaurantService RestaurantService;

    RestaurantRepo restaurantRepository;

    @GetMapping("/retrieve-all-Restaurants")
    public List<Restaurant> getRestaurants() {
        return RestaurantService.findAll();
    }
    @GetMapping("/retrieve-Restaurant/{Restaurant-id}")
    public Restaurant retrieveRestaurant(@PathVariable("Restaurant-id") Long RestaurantId) {
        return RestaurantService.findById(RestaurantId);
    }
    @PostMapping("/add-Restaurant")
    public Restaurant addCRestaurant(@RequestBody Restaurant c) {
        return RestaurantService.save(c);
    }
    @DeleteMapping("/remove-Restaurant/{Restaurant-id}")
    public void removeRestaurant(@PathVariable("Restaurant-id") Long RestaurantId) {
        RestaurantService.delete(RestaurantId);
    }
    @PutMapping("/update-Restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant c) {
        return RestaurantService.update(c);
    }



    @GetMapping("/findByNbPlacesMaxGreaterThanAndChainerestaurationDateCreationBefore/{capacite}/{date}")
    public List<Restaurant> findByNbPlacesMaxGreaterThanAndChainerestaurationDateCreationBefore(
            @PathVariable("capacite") Long capacite,
            @PathVariable("date") LocalDate date)
    {
        return restaurantRepository.findByNbPlacesMaxGreaterThanAndChainerestaurationDateCreationBefore(capacite,date);
    }
}