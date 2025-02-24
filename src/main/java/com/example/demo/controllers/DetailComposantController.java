package com.example.demo.controllers;


import com.example.demo.service.IDetailComposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DetailComposantController {
    private IDetailComposantService detailComposantService;
}
