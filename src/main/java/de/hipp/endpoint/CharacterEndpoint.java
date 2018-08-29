package de.hipp.endpoint;

import de.hipp.constants.EndpointConstants;
import de.hipp.enity.Character;
import de.hipp.service.CharacterService;
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
@RequestMapping(EndpointConstants.CHARACTERENDPOINT)
public class CharacterEndpoint {

    private final CharacterService characterService;

    public CharacterEndpoint(CharacterService service) {
        this.characterService = service;
    }

    @GetMapping
    public List<Character> getAllRaces() {
        return characterService.findAll();
    }

    @GetMapping("{id}")
    public Character getRaceByID(@PathVariable Integer id) {
        return characterService.findByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Character saveRace(@RequestBody Character character) {
        return characterService.saveEntity(character);
    }
}
