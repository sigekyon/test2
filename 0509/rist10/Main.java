package rist10;

public class Main {

    public static void main(String[] args) {
         
        Sword s = new Sword();
        s.name = "���̌�";
        s.damage = 10;
        // 1.�E�҂𐶐�
        Hero h = new Hero();
        
        Hero.setRandomMoney();

        System.out.println("�������F" + h.money);
        
        // 2.�t�B�[���h�ɏ����l���Z�b�g
        h.getName();
        h.getHp();
        h.sword = s;
        
//        Wizard w = new Wizard();
//        w.name = "�X�K����";
//        w.hp = 50;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';
                
        System.out.println("�E��" + h.getName() + "�𐶂ݏo���܂����I");        
        System.out.println("���݂̕����" + h.sword.name);
        
//        w.heal(h);
        
        System.out.println("�������L�m�R�����ꂽ");
        
        // 3.�E�҂̃��\�b�h���Ăяo���Ă䂭
        h.attack();
        h.sit(5);
        h.slip();
        m1.attack();
        h.sit(25);
        m1.attack();
        h.run();
    }

}
