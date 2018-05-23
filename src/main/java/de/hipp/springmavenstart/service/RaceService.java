package de.hipp.springmavenstart.service;

import de.hipp.springmavenstart.enity.Race;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RaceService {

    public List<Race> findAll();

    public Race findByID(Integer Id);

    Race saveRace (Race race);
}
