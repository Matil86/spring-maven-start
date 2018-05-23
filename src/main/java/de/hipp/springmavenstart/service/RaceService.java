package de.hipp.springmavenstart.service;

import de.hipp.springmavenstart.enity.Race;

import java.util.List;


public interface RaceService {

    public List<Race> findAll();

    public Race findByID(Integer Id);

    Race saveRace (Race race);
}
