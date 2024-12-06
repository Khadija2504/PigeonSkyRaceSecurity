package com.PigeonSkyRace.Pigeon.service;

import com.PigeonSkyRace.Pigeon.model.User;

import java.util.Optional;

public interface UserService {
    User createBreeder(User breeder);
    Optional<User> findByEmail(String email);
    User getBreederById(int breederId);
}