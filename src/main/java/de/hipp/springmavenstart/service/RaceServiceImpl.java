package de.hipp.springmavenstart.service;

import de.hipp.springmavenstart.enity.Race;
import de.hipp.springmavenstart.repo.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    public RaceServiceImpl (RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public List<Race> findAll () {
        return raceRepository.findAll();
    }

    @Override
    public Race findByID (Integer Id) {
        return raceRepository.findById(Id).get();
    }

    @Override
    public Race saveRace (Race race) {
        return raceRepository.save(race);
    }
}
