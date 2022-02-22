package thepackage.recruiters;

import thepackage.heroInterfaces.Hero;
import thepackage.locatorpackage.HeroLocator;

public class RebelRecruiter {
    public static void main(String[] args){
        Hero hero = HeroLocator.getNextRebelHero();
        System.out.println("We have recruited: "+hero.getName());
    }
}
