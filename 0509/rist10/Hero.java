package rist10;

public class Hero {
    
    private String name; // ���O�̐錾
    private int hp; // HP�̐錾
    
    static int money;
    
    Sword sword;
    
    void bye(){
        System.out.println("�E�҂͕ʂ���������B");
    }
    
    private void die(){
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
    void sleep(){
        this.hp = 100;
        System.out.println(this.name + "�́A�����ĉ񕜂���!!");
    }
    
    void attack(Matango m1){
        System.out.println(this.name + "�̍U��!!");
        System.out.println("�������L�m�R" + m1.suffix + "����2�|�C���g�̔������󂯂�");
        this.hp -= 2;
        if(this.hp <= 0){
            this.die();
        }
    }
    
    Hero(){
        this.hp = 100; // hp�t�B�[���h��100�ŏ�����
        this.name = "�~�i�g";
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public String getName(){
        return this.name;
    }
    
    static void setRandomMoney(){
        Hero.money = (int)(Math.random() * 1000);
    }



}
