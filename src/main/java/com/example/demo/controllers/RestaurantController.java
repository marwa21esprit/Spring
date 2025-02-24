package com.example.demo.controllers;

import com.example.demo.service.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private IRestaurantService restaurantService;
}
