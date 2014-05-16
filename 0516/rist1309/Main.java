package rist1309;

public class Main {
    
    public static void main (String[] args) {
        
        Hero h = new Hero();
        Slime s = new Slime();
        Goblin g = new Goblin();
        DeathBat d = new DeathBat();
        Matango t = new Matango();
        
        h.attack(s);
        h.attack(g);
        h.attack(d);
        h.attack(t);
        
        s.name = "スライム";
        g.name = "ゴブリン";
        d.name = "地獄コウモリ";
        t.name = "お化けキノコ";
        
        Monster[] monsters = new Monster[4];
        
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new DeathBat();
        monsters[3] = new Matango();
        
        for (Monster m:monsters) {
            m.run();
        }
        
    }

}
