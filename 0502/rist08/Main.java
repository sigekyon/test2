package rist08;

public class Main {

    public static void main(String[] args) {
        // 1.�E�҂𐶐�
        Hero h = new Hero();
        // 2.�t�B�[���h�ɏ����l���Z�b�g
        h.name = "�~�i�g";
        h.hp = 100;
        System.out.println("�E��" + h.name + "�𐶂ݏo���܂����I");
        // 3.�E�҂̃��\�b�h���Ăяo���Ă䂭
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }

}
