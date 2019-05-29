package de.hipp.endpoint;

import de.hipp.constants.EndpointConstants;
import de.hipp.controller.CharacterController;
import de.hipp.entity.CharacterEntity;
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
public class CharacterService {

    private final CharacterController characterController;

    public CharacterService(CharacterController service) {
        this.characterController = service;
    }

    @GetMapping
    public List<CharacterEntity> getAllRaces() {
        return characterController.findAll();
    }

    @GetMapping("{id}")
    public CharacterEntity getRaceByID(@PathVariable Integer id) {
        return characterController.findByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CharacterEntity saveRace(@RequestBody CharacterEntity characterEntity) {
        return characterController.saveEntity(characterEntity);
    }
}
