package com.example.demo.service;

import com.example.demo.entities.Menu;

import java.util.List;

public interface IMenuService {
    Menu save(Menu menu);
    Menu update(Menu menu);
    void delete(Long id);
    Menu findById(Long id);
    List<Menu> findAll();
}
