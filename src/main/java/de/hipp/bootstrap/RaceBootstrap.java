package de.hipp.bootstrap;


import de.hipp.constants.Races;
import de.hipp.enity.Race;
import de.hipp.service.BaseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RaceBootstrap implements CommandLineRunner {

    private final BaseService raceService;

    public RaceBootstrap(BaseService raceService) {
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
        Race race = new Race();
        race.setName(raceName);
        raceService.saveEntity(race);
    }
}
