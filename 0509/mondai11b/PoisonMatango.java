package mondai11b;

public class PoisonMatango extends Matango{
    
    private int PoisonCount = 5;
    
    public PoisonMatango(char suffix){
        super(suffix);
    }
    
    public PoisonMatango() {
        // TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
    }

    public void attack(Hero h){
        super.attack(h);
        
        if (PoisonCount > 0){
            System.out.println("����ɓł̖E�q���΂�܂���!");
            int dmg = h.getHp()/5;
            h.setHp(h.getHp() - dmg);
            System.out.println(dmg + "�|�C���g�̃_���[�W��^����!!");
            this.PoisonCount--;
        }
    }

}
