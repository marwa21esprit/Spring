package com.example.demo.service;

import com.example.demo.entities.Commande;
import com.example.demo.repository.CommandeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService{
    CommandeRepo commandeRepository;
    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande update(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }


    public List<Commande> findByClientId(Long id) {
        return commandeRepository.findByClientIdClient(id);
    }
}
