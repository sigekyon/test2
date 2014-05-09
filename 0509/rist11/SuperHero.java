package rist11;

public class SuperHero extends Hero {
    private boolean flying;
    
    public void fly() {
        this.flying = true;
        System.out.println("��яオ����!!");
    }
    
    public void land() {
        this.flying = false;
        System.out.println("���n����!!");
    }
    
    public void run() {
        System.out.println("�P�ނ����B�B�B");
    }
    
    public void attack(Matango m){
        super.attack(m);
        if(this.flying) {
            super.attack(m);
        }
    }
    
    public SuperHero() {
        super() ;
        System.out.println("SuperHero����������܂����B");
        System.out.println("SuperHero�̃R���X�g���N�^������");
    }

}
