package com.example.demo.controllers;


import com.example.demo.service.IDetailComposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.DetailComposant;


import java.util.List;


@RequestMapping("/Dcomposant")
@RestController
@AllArgsConstructor
public class DetailComposantController {

    IDetailComposantService DetailComposantService;

    @GetMapping("/retrieve-all-Dcomposant")
    public List<DetailComposant> getDcomposants() {
        return DetailComposantService.findAll();
    }
    @GetMapping("/retrieve-Dcomposant/{Dcomposant-id}")
    public DetailComposant retrieveDcomposants(@PathVariable("Dcomposant-id") Long Dcomposantid) {
        return DetailComposantService.findById(Dcomposantid);
    }
    @PostMapping("/add-Dcomposant")
    public DetailComposant addDcomposant(@RequestBody DetailComposant Dcomposant) {
        return DetailComposantService.save(Dcomposant);
    }
    @DeleteMapping("/remove-Dcompsant/{Dcomposant-id}")
    public void removeDcomposant(@PathVariable("Dcomposant-id") Long Dcomposantid) {
        DetailComposantService.delete(Dcomposantid);
    }
    @PutMapping("/update-Dcomposant")
    public DetailComposant updateDcomposant(@RequestBody DetailComposant Dcomposant) {
        return DetailComposantService.update(Dcomposant);
    }
}