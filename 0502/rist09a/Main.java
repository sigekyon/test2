package rist09a;

public class Main {

    public static void main(String[] args) {
         
        Sword s = new Sword();
        s.name = "���̌�";
        s.damage = 10;
        // 1.�E�҂𐶐�
        Hero h = new Hero();
        
        Hero.money = 100;
        System.out.println("�������F" + Hero.money);
        
        // 2.�t�B�[���h�ɏ����l���Z�b�g
        h.name = "�~�i�g";
        h.hp = 100;
        h.sword = s;
        
        Wizard w = new Wizard();
        w.name = "�X�K����";
        w.hp = 50;
        
        System.out.println("�E��" + h.name + "�𐶂ݏo���܂����I");
        
        System.out.println("���݂̕����" + h.sword.name);
        
        w.heal(h);
        
        // 3.�E�҂̃��\�b�h���Ăяo���Ă䂭
        h.attack();
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }

}
