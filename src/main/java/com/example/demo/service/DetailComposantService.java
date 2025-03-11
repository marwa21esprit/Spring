package com.example.demo.service;
import com.example.demo.entities.DetailComposant;
import com.example.demo.repository.DetailComposantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService{
    private DetailComposantRepo detailComposantRepository;

    @Override
    public DetailComposant save(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public DetailComposant update(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public void delete(Long id) {
        detailComposantRepository.deleteById(id);
    }

    @Override
    public DetailComposant findById(Long id) {
        return detailComposantRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetailComposant> findAll() {
        return detailComposantRepository.findAll();
    }
}
