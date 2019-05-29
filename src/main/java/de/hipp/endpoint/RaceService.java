package de.hipp.endpoint;

import de.hipp.constants.EndpointConstants;
import de.hipp.controller.RaceController;
import de.hipp.entity.RaceEntity;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointConstants.RACEENDPOINT)
public class RaceService {

    private final RaceController raceController;

    public RaceService(RaceController raceController) {
        this.raceController = raceController;
    }

    @GetMapping
    public List<RaceEntity> getAllRaces() {
        return raceController.findAll();
    }

    @GetMapping("{id}")
    public RaceEntity getRaceByID(@PathVariable Integer id) {
        return raceController.findByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RaceEntity saveRace(@RequestBody RaceEntity raceEntity) {
        return raceController.saveEntity(raceEntity);
    }
}
