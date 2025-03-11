package com.example.demo.service;

import com.example.demo.entities.ChefCuisinier;
import com.example.demo.repository.ChefCuisinierRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChefCuisinierService implements IChefCuisinerService{

    ChefCuisinierRepo chefCuisinierRepository;

    @Override
    public ChefCuisinier save(ChefCuisinier chefCuisinier) {
        return chefCuisinierRepository.save(chefCuisinier);
    }

    @Override
    public ChefCuisinier update(ChefCuisinier chefCuisinier) {
        return chefCuisinierRepository.save(chefCuisinier);
    }

    @Override
    public void delete(Long id) {
        chefCuisinierRepository.deleteById(id);
    }

    @Override
    public ChefCuisinier findById(Long id) {
        return chefCuisinierRepository.findById(id).orElse(null);
    }

    @Override
    public List<ChefCuisinier> findAll() {
        return chefCuisinierRepository.findAll();
    }

}
