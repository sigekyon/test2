package rist12;

public abstract class WalkingMonster extends Monster{
    
    public void run() {
        System.out.println(this.name + "�̓g�R�g�R�����ē�����");
    }

    public abstract void attack();
}
