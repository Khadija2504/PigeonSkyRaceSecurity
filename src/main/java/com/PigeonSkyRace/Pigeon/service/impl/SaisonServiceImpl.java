package com.PigeonSkyRace.Pigeon.service.impl;

import com.PigeonSkyRace.Pigeon.model.Season;
import com.PigeonSkyRace.Pigeon.repository.SaisonRepository;
import com.PigeonSkyRace.Pigeon.service.SaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaisonServiceImpl implements SaisonService {
    @Autowired
    private SaisonRepository saisonRepository;
    @Override
    public Season getSaison(String name) {
        return saisonRepository.findSaisonByName(name);
    }

    @Override
    public List<Season> getAllSeasons() {
        return saisonRepository.findAll();
    }

    @Override
    public Season addSaison(Season saison) {
        return saisonRepository.save(saison);
    }
}
