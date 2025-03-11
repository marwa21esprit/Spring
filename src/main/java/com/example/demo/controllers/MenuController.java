package com.example.demo.controllers;

import com.example.demo.service.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Menu;
import com.example.demo.enums.TypeComposant;
import com.example.demo.enums.TypeMenu;
import com.example.demo.repository.MenuRepo;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Menu")

public class MenuController {
    private IMenuService menuService;

    IMenuService MenuService;

    MenuRepo MenuRepo;

    @GetMapping("/retrieve-all-Menus")
    public List<Menu> getMenus() {
        return MenuService.findAll();
    }
    @GetMapping("/retrieve-Menu/{Menu-id}")
    public Menu retrieveMenu(@PathVariable("Menu-id") Long MenuId) {
        return MenuService.findById(MenuId);
    }
    @PostMapping("/add-Menu")
    public Menu addCMenu(@RequestBody Menu c) {
        return MenuService.save(c);
    }
    @DeleteMapping("/remove-Menu/{Menu-id}")
    public void removeMenu(@PathVariable("Menu-id") Long MenuId) {
        MenuService.delete(MenuId);
    }
    @PutMapping("/update-Menu")
    public Menu updateMenu(@RequestBody Menu c) {
        return MenuService.update(c);
    }



    @GetMapping("/getMenusByTypeandOrdre/{typeMenu}")
    public List<Menu> findByTypeMenuAndOrderByPrixTotal(@PathVariable("typeMenu") String tTM){
        TypeMenu typeMenu = TypeMenu.valueOf(tTM.toUpperCase());
        return MenuRepo.findByTypeMenuAndOrderByPrixTotal(typeMenu);
    }

    @GetMapping("/findByTypeComposant/{typeComposant}")
    public List<Menu> findByTypeComposant(@PathVariable("typeComposant") String TC){
        TypeComposant type = TypeComposant.valueOf(TC.toUpperCase());

        return MenuRepo.findByTypeComposant(type);
    }
    @GetMapping("/findByTypeMenuAndPrixTotalGreaterThan/{typeMenu}/{prix}")
    public List<Menu> findByTypeMenuAndPrixTotalGreaterThan(@PathVariable("typeMenu") String TM, @PathVariable("prix") Float prix){
        TypeMenu typeMenu = TypeMenu.valueOf(TM.toUpperCase());
        return MenuRepo.findByTypeMenuAndPrixTotalGreaterThan(typeMenu,prix);
    }

}