package de.hipp.springmavenstart.repo;

import de.hipp.springmavenstart.enity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race,Integer> {
}
