package rist13;

public class Main {
    
    public static void main (String[] args) {
        
        Character c = new Wizard();
        Wizard w = (Wizard) c;
        
        Matango m = new Matango();
        c.name = "ÉAÉTÉJ";
        c.attack(m);
        c.fireball(m);
    }

}
