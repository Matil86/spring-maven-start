package de.hipp.repo;

import de.hipp.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race,Integer> {
}
