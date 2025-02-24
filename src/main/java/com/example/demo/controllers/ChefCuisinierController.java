package com.example.demo.controllers;

import com.example.demo.service.IChefCuisinerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChefCuisinierController {
    private IChefCuisinerService chefCuisinierService;
}
