package mondai11b;

public class Main {

    public static void main(String[] args) {
         
        // 1.�E�҂𐶐�
        Hero h = new Hero();
        
//        Matango m = new Matango ();
        
        PoisonMatango m2 = new PoisonMatango ();
                
        // 2.�t�B�[���h�ɏ����l���Z�b�g
        h.getName();
        h.getHp();
                        
//        System.out.println("�E��" + h.getName() + "�𐶂ݏo���܂����I");        

        System.out.println("�������L�m�R�����ꂽ");
        
        // 3.�E�҂̃��\�b�h���Ăяo���Ă䂭
        h.attack(m2);
        m2.attack(h);
        h.attack(m2);
        h.slip();
        h.sit(15);
        m2.attack(h);
        h.run();
    }

}
