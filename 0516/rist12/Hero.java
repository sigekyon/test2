package rist12;

public class Hero extends Character {
    
    private String name = "�E��";
    
    public void attack(Matango m) {
        System.out.println(this.name + "�̍U��!!");
        System.out.println("�G��10�|�C���g�̃_���[�W��^����!!");
        m.hp -= 10;
    }
    
}
