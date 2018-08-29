package de.hipp.springmavenstart.bootstrap;


import de.hipp.springmavenstart.constants.Races;
import de.hipp.springmavenstart.enity.Race;
import de.hipp.springmavenstart.service.RaceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RaceBootstrap implements CommandLineRunner {

    private final RaceService raceService;

    public RaceBootstrap (RaceService raceService) {
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
        raceService.saveRace(race);
    }
}
