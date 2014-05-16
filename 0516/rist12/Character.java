package rist12;

public abstract class Character {
    
    String name;
    int hp;
    
    public void run() {
        System.out.println(this.name + "‚Í“¦‚°o‚µ‚½");
    }
    
    public abstract void attack(Matango m);

}
