package de.hipp.service;

import de.hipp.enity.Race;
import de.hipp.repo.RaceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RaceService implements BaseService<Race> {

    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
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
    public Race saveEntity(Race race) {
        return raceRepository.save(race);
    }
}
