package com.example.demo.controllers;

import com.example.demo.service.IChefCuisinerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.ChefCuisinier;
import com.example.demo.service.IChefCuisinerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ChefCuisinier")
public class ChefCuisinierController {

    IChefCuisinerService ChefCuisinierService;


    @GetMapping("/retrieve-all-Chefs")
    public List<ChefCuisinier> getChefs() {
        return ChefCuisinierService.findAll();
    }
    @GetMapping("/retrieve-ChefCuisinier/{ChefCuisinier-id}")
    public ChefCuisinier retrieveChefCuisinier(@PathVariable("ChefCuisinier-id") Long ChefCuisinierId) {
        return ChefCuisinierService.findById(ChefCuisinierId);
    }
    @PostMapping("/add-ChefCuisinier")
    public ChefCuisinier addChefCuisinier(@RequestBody ChefCuisinier c) {
        return ChefCuisinierService.save(c);
    }
    @DeleteMapping("/remove-ChefCuisinier/{ChefCuisinier-id}")
    public void removeChefCuisinier(@PathVariable("ChefCuisinier-id") Long ChefCuisinierId) {
        ChefCuisinierService.delete(ChefCuisinierId);
    }
    @PutMapping("/update-ChefCuisinier")
    public ChefCuisinier updateChefCuisinier(@RequestBody ChefCuisinier c) {
        return ChefCuisinierService.update(c);
    }
}