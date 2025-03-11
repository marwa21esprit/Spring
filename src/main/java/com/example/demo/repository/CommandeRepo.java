package com.example.demo.repository;

import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CommandeRepo extends JpaRepository<Commande, Long> {

    List<Commande> findByClientIdClient(Long id);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long id, LocalDate date1, LocalDate date2);

    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAscNoteAsc(LocalDate date1, LocalDate date2);

}
