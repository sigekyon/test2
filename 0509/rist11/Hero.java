package rist11;

public class Hero {
    
    private String name = "�~�i�g";
    private int hp = 100;
    
    public void attack(Matango m){
        System.out.println(this.name + "�̍U��!!");
        m.hp -= 5;
        System.out.println("5�|�C���g�̃_���[�W��^����!!");
    }
    
    public final void slip(){
        this.hp -= 5;
        System.out.println(this.getName() + "�͓]��!!");
        System.out.println("5�̃_���[�W");
    }
    
    public void run(){
        System.out.println(this.name + "�͓����o����!!");
    }
    
    public String getName() {
        return this.name;
    }
    
    public Hero() {
        System.out.println("Hero�̃R���X�g���N�^������");
    }

}
