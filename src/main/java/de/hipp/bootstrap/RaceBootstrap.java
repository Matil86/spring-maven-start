package de.hipp.bootstrap;


import de.hipp.constants.Races;
import de.hipp.controller.RaceController;
import de.hipp.entity.RaceEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RaceBootstrap implements CommandLineRunner {

    private final RaceController raceService;

    public RaceBootstrap(RaceController raceService) {
        this.raceService = raceService;
    }

    @Override
    public void run (String... args) throws Exception {
        for (Races entry : Races.values()) {
            if (entry == null) {
                // this shouldn't happen but just in case
                continue;
            }
            createRace(entry.toString());
        }
    }

    private void createRace(String raceName) {
        RaceEntity raceEntity = new RaceEntity();
        raceEntity.setName(raceName);
        raceService.saveEntity(raceEntity);
    }
}
