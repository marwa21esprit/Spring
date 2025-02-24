package com.example.demo.controllers;

import com.example.demo.service.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChaineRestaurationController {
    private IChaineRestaurationService chaineRestaurationService;
}
