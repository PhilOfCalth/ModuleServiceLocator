package thepackage.locatorpackage;

import thepackage.heroInterfaces.Hero;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class HeroLocator {
    public static List<Hero> getRebelHeros(){
        ServiceLoader<Hero> loader = ServiceLoader.load(Hero.class);
        return loader.stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
    public static Hero getNextRebelHero(){
        ServiceLoader<Hero> loader = ServiceLoader.load(Hero.class);
        return loader.stream()
                .map(ServiceLoader.Provider::get)
                .findFirst()
                .get();
    }
}