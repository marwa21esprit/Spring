package com.example.demo.service;

import com.example.demo.entities.Composant;
import com.example.demo.repository.ComposantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
    ComposantRepo composantRepository;

    @Override
    public Composant save(Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public Composant update(Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public void delete(Long id) {
        composantRepository.deleteById(id);
    }

    @Override
    public Composant findById(Long id) {
        return composantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Composant> findAll() {
        return composantRepository.findAll();

    }
}