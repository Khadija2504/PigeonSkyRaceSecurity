package com.PigeonSkyRace.Pigeon.service;

import com.PigeonSkyRace.Pigeon.model.Season;

import java.util.List;

public interface SaisonService {
    Season getSaison(String name);
    Season addSaison(Season saison);
    List<Season> getAllSeasons();
}
