package de.hipp.service;

import de.hipp.enity.Character;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CharacterService implements BaseService<Character> {

    @Override
    public List<Character> findAll() {
        return null;
    }

    @Override
    public Character findByID(Integer Id) {
        return null;
    }

    @Override
    public Character saveEntity(Character character) {
        return null;
    }
}
