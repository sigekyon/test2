package rist12;

public abstract class WalkingMonster extends Monster{
    
    public void run() {
        System.out.println(this.name + "はトコトコ走って逃げる");
    }

    public abstract void attack();
}
