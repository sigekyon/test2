package mondai10;

public class Hero {
    
    private String name; // ���O�̐錾
    private int hp; // HP�̐錾
    
    static int money;
    
    
    void bye() {
        System.out.println("�E�҂͕ʂ���������B");
    }
    
    private void die() {
        System.out.println(this.name + "�͎���ł��܂���!!");
        System.out.println("GAME OVER�ł��B�B�B");
    }
    
    void attack() {
        System.out.println(this.name + "�͍U������!");
        System.out.println("�G��5�̃_���[�W��^�����I");
    }
    void run() {
        System.out.println(this.name + "�́A�����o����!!");
   //   System.out.println("GAMEOVER");
        System.out.println("�ŏIHP��" + this.hp + "�ł����B");
    }
    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "�́A" + sec + "�b������!!");
        System.out.println("HP��" + sec + "�|�C���g�񕜂����B");
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "�́A�]��!!");
        System.out.println("5�̃_���[�W!!");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "�́A�����ĉ񕜂���!!");
    }
    
    
    Hero() {
        this.hp = 100; // hp�t�B�[���h��100�ŏ�����
        this.name = "�~�i�g";
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public String getName() {
        return this.name;
    }
    
    static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
    }

    public void setHp(int hp) {
        this.hp = hp;           
    }    


}
