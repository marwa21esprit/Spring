package com.example.demo.service;

import com.example.demo.entities.ChaineRestauration;
import com.example.demo.repository.ChaineRestaurationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService {

    private final ChaineRestaurationRepo chaineRestaurationRepository;

    @Override
    public List<ChaineRestauration> retrieveAllChainesRestauration() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaineRestauration(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration updateChaineRestauration(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration) {
        return chaineRestaurationRepository.findById(idChaineRestauration).orElse(null);
    }

    @Override
    public void removeChaineRestauration(Long idChaineRestauration) {
        chaineRestaurationRepository.deleteById(idChaineRestauration);
    }

    @Override
    public List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration) {
        return chaineRestaurationRepository.saveAll(chainesRestauration);
    }
}
