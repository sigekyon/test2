package rist10;

public class Matango {
    
    int hp;
    final int level = 10;
    char suffix;
    
    void run(){
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }

    void attack(){
        System.out.println("お化けキノコ" + this.suffix + "の攻撃!!");
        System.out.println("お化けキノコ" + this.suffix + "から2ポイントの反撃を受けた");
    }
    
}
