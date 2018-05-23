package de.hipp.springmavenstart.endpoint;

import de.hipp.springmavenstart.enity.Race;
import de.hipp.springmavenstart.service.RaceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(RaceEndpoint.BASE_URL)
public class RaceEndpoint {

    public static final String BASE_URL ="/api/v1/races";
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
        return raceService.saveRace(race);
    }
}
