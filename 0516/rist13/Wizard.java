package rist13;

public class Wizard extends Character {
    
    int mp;
    
    public void attack(Matango m) {
        System.out.println(this.name + "�̍U��!!");
        System.out.println("�G��3�|�C���g�̃_���[�W");
        m.hp -= 3;
    }
    
    public void fireball(Matango m) {
        System.out.println(this.name + "�͉΂̋ʂ������!!");
        System.out.println("�G��20�|�C���g�̃_���[�W");
        m.hp -= 20;
        this.mp -= 5;
    }

}
