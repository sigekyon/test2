package rist10;

public class Wizard {
    String name;
    int hp;
    void heal(Hero h) {
        h.getHp();
        System.out.println(h.getName() + "のHPを10回復した!!");
    }

}
