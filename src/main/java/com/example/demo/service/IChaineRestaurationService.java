package com.example.demo.service;

import com.example.demo.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChainesRestauration();
    ChaineRestauration save(ChaineRestauration e);
    ChaineRestauration update (ChaineRestauration e);
    ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration);
    void delete(Long idChaineRestauration);
    List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration);

    ChaineRestauration findById(Long id);

    List<ChaineRestauration> findAll();


}