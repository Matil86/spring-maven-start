package de.hipp.controller;

import de.hipp.entity.RaceEntity;
import de.hipp.repo.RaceRepository;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceController implements BaseEntityController<RaceEntity> {

    private final RaceRepository raceRepository;

    public RaceController(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public List<RaceEntity> findAll() {
        return raceRepository.findAll();
    }

    @Override
    public RaceEntity findByID(Integer Id) {
        return raceRepository.findById(Id).get();
    }

    @Override
    public RaceEntity saveEntity(RaceEntity raceEntity) {
        Logger.getLogger(this.getClass()).info("saving: " + raceEntity);
        return raceRepository.save(raceEntity);
    }
}
