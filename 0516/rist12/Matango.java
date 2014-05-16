package rist12;

public class Matango extends WalkingMonster{
    
    public void attack(){
        System.out.println("胞子を飛ばしてきた");
        System.out.println(this.name + "の攻撃!!");
        System.out.println("5ポイントのダメージ");
        hp -= 5;
    }

}
