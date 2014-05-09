package rist11;

public class Hero {
    
    private String name = "ミナト";
    private int hp = 100;
    
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃!!");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた!!");
    }
    
    public final void slip(){
        this.hp -= 5;
        System.out.println(this.getName() + "は転んだ!!");
        System.out.println("5のダメージ");
    }
    
    public void run(){
        System.out.println(this.name + "は逃げ出した!!");
    }
    
    public String getName() {
        return this.name;
    }
    
    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }

}
