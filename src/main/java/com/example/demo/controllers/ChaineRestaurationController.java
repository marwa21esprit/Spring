package com.example.demo.controllers;

import com.example.demo.entities.ChaineRestauration;
import com.example.demo.service.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.IChaineRestaurationService;
import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/ChaineRestauration")
public class ChaineRestaurationController {

    IChaineRestaurationService ChaineRestaurationService;

    @GetMapping("/retrieve-all-ChaineRestaurations")
    public List<ChaineRestauration> getChaineRestaurations() {
        return ChaineRestaurationService.findAll();
    }
    @GetMapping("/retrieve-ChaineRestauration/{ChaineRestauration-id}")
    public ChaineRestauration retrieveChaineRestauration(@PathVariable("ChaineRestauration-id") Long ChaineRestaurationId) {
        return ChaineRestaurationService.findById(ChaineRestaurationId);
    }
    @PostMapping("/add-ChaineRestauration")
    public ChaineRestauration addChaineRestauration(@RequestBody ChaineRestauration c) {
        return ChaineRestaurationService.save(c);
    }
    @DeleteMapping("/remove-ChaineRestauration/{ChaineRestauration-id}")
    public void removeChaineRestauration(@PathVariable("ChaineRestauration-id") Long ChaineRestaurationId) {
        ChaineRestaurationService.delete(ChaineRestaurationId);
    }
    @PutMapping("/update-ChaineRestauration")
    public ChaineRestauration updateChaineRestauration(@RequestBody ChaineRestauration c) {
        return ChaineRestaurationService.update(c);
    }
}