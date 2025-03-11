package com.example.demo.service;

import com.example.demo.entities.Client;

import java.util.List;

public interface IClientService {
    Client save(Client client);
    Client update(Client client);
    void delete(Long id);
    Client findById(Long id);
    List<Client> findAll();
}
