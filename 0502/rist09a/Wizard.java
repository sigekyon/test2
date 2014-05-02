package rist09a;

public class Wizard {
    String name;
    int hp;
    void heal(Hero h) {
        h.hp += 10;
        System.out.println(h.name + "‚ÌHP‚ð10‰ñ•œ‚µ‚½!!");
    }

}
