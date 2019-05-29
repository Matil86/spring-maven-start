package de.hipp.repo;

import de.hipp.entity.RaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceDao extends JpaRepository<RaceEntity, Integer> {
}
