package rist10;

public class Hero {
    
    private String name; // 名前の宣言
    private int hp; // HPの宣言
    
    static int money;
    
    Sword sword;
    
    void bye(){
        System.out.println("勇者は別れを告げた。");
    }
    
    private void die(){
        System.out.println(this.name + "は死んでしまった!!");
        System.out.println("GAME OVERです。。。");
    }
    
    void attack() {
        System.out.println(this.name + "は攻撃した!");
        System.out.println("敵に5のダメージを与えた！");
    }
    void run() {
        System.out.println(this.name + "は、逃げ出した!!");
   //   System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした。");
    }
    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った!!");
        System.out.println("HPが" + sec + "ポイント回復した。");
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ!!");
        System.out.println("5のダメージ!!");
    }
    void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した!!");
    }
    
    void attack(Matango m1){
        System.out.println(this.name + "の攻撃!!");
        System.out.println("お化けキノコ" + m1.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if(this.hp <= 0){
            this.die();
        }
    }
    
    Hero(){
        this.hp = 100; // hpフィールドを100で初期化
        this.name = "ミナト";
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
