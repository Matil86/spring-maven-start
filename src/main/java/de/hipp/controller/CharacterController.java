package de.hipp.controller;

import de.hipp.entity.CharacterEntity;
import de.hipp.repo.CharacterRepository;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterController implements BaseEntityController<CharacterEntity> {

    private final CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<CharacterEntity> findAll() {
        return characterRepository.findAll();
    }

    public CharacterEntity findByID(Integer id) {
        return characterRepository.findById(id).orElse(null);
    }

    public CharacterEntity saveEntity(CharacterEntity characterEntity) {
        Logger.getLogger(this.getClass()).info("saving: " + characterEntity);
        return characterRepository.save(characterEntity);
    }
}
