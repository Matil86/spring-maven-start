package de.hipp.springmavenstart.bootstrap;


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
        Race dwarfs = new Race();
        dwarfs.setName("Dwarf");
        raceService.saveRace(dwarfs);

        Race humans = new Race();
        humans.setName("Humans");
        raceService.saveRace(humans);
    }
}
