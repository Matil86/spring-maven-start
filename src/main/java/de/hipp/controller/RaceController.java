package de.hipp.controller;

import de.hipp.entity.RaceEntity;
import de.hipp.repo.RaceDao;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RaceController implements BaseEntityController<RaceEntity> {

    private final RaceDao raceDao;

    public RaceController(RaceDao raceDao) {
        this.raceDao = raceDao;
    }

    @Override
    public List<RaceEntity> findAll() {
        return raceDao.findAll();
    }

    @Override
    public RaceEntity findByID(Integer Id) {
        return raceDao.findById(Id).get();
    }

    @Override
    public RaceEntity saveEntity(RaceEntity raceEntity) {
        return raceDao.save(raceEntity);
    }
}
