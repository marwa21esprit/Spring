package com.example.demo.controllers;

import com.example.demo.service.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CommandeController {
    private ICommandeService commandeService;
}
