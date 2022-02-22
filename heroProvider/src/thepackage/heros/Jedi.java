package thepackage.heros;

import thepackage.heroInterfaces.Hero;

import java.util.List;
import java.util.Random;

public class Jedi implements Hero {

    private static final List<String> heroicNames = List.of(
            "Luke Skywalker",
            "Obi-Wan Kenobi",
            "Yoda",
            "Ahsoka Tano",
            "Caleb Dume",
            "Ezra Bridger",
            "Cal Kestis",
            "Corran Horn" );
    private static final Random random = new Random();
    private final String name;

    public Jedi(){
        name = heroicNames.get(random.nextInt(heroicNames.size()));
    }

    @Override
    public String getName() {
        return name;
    }
}