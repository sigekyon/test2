package rist09a;

public class Hero {
    
    String name; // ���O�̐錾
    int hp; // HP�̐錾
    
    static int money;
    
    Sword sword;
    
    void attack() {
        System.out.println(this.name + "�͍U������!");
        System.out.println("�G��5�̃_���[�W��^�����I");
    }
    void run() {
        System.out.println(this.name + "�́A�����o����!!");
        System.out.println("GAMEOVER");
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
    
    Hero(){
        this.hp = 100; // hp�t�B�[���h��100�ŏ�����
    }

}
