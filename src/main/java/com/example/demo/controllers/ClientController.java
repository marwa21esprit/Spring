package com.example.demo.controllers;

import com.example.demo.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientController {
    private IClientService clientService;
}
