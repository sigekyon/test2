package mondai11b;

public class Hero {
    
    private String name = "�~�i�g";
    private int hp = 100;
    
    public void attack(Matango m){
        System.out.println(this.name + "�̍U��!!");
        m.setHp(m.getHp() - 5);
        System.out.println("5�|�C���g�̃_���[�W��^����!!");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "�́A" + sec + "�b������!!");
        System.out.println("HP��" + sec + "�|�C���g�񕜂����B");
    }
    
    public final void slip(){
        this.hp -= 5;
        System.out.println(this.getName() + "�͓]��!!");
        System.out.println("5�̃_���[�W");
    }
    
    public void run(){
        System.out.println(this.name + "�͓����o����!!");
    }

    private void die(){
        System.out.println(this.name + "�͎���ł��܂���!!");
        System.out.println("GAME OVER�ł��B�B�B");
    }

    public String getName() {
        return this.name;
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
    
    public Hero() {
//        System.out.println("Hero�̃R���X�g���N�^������");
    }

}
