package rist12;

public abstract class Character {
    
    String name;
    int hp;
    
    public void run() {
        System.out.println(this.name + "�͓����o����");
    }
    
    public abstract void attack(Matango m);

}
