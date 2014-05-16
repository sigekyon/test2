package rist12;

public class Goblin extends WalkingMonster{
    
    public void attack(){
        System.out.println("ナイフで斬りつける");
        System.out.println(this.name + "の攻撃!!");
        System.out.println("5ポイントのダメージ");
        hp -= 5;
    }

}
