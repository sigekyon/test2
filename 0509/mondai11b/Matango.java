package mondai11b;

public class Matango {
    
    private int hp = 50;
    private char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    
    public Matango() {
        // TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
    }

    public int getHp(){
        return this.hp;
    }
    
    public void setHp(int hp){
        if(hp < 0){
            this.hp = hp;
        }
        
        else{
            this.hp = hp;
        }
    }
    
    public void attack(Hero h){
        System.out.println("�L�m�R" + this.suffix + "�̍U��!!");
        System.out.println("10�̃_���[�W");
        h.setHp(h.getHp() -10);
    }

}
