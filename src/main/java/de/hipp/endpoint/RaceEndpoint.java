package de.hipp.endpoint;

import de.hipp.constants.EndpointConstants;
import de.hipp.entity.Race;
import de.hipp.service.RaceService;
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
public class RaceEndpoint {

    private final RaceService raceService;

    public RaceEndpoint (RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public List<Race> getAllRaces(){
        return raceService.findAll();
    }

    @GetMapping("{id}")
    public Race getRaceByID(@PathVariable Integer id){
        return raceService.findByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Race saveRace(@RequestBody Race race){
        return raceService.saveEntity(race);
    }
}
