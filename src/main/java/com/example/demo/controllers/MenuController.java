package com.example.demo.controllers;

import com.example.demo.service.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {
    private IMenuService menuService;
}
