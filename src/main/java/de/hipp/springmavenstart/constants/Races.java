package de.hipp.springmavenstart.constants;

public enum Races {

    Dwarfs("Dwarfs"),
    Elfs("Elf"),
    Human("Humans");

    private String identifier;

    private Races(String indentifier) {
        this.identifier = indentifier;
    }

    public String toString() {
        return this.identifier;
    }

}
