package rist1309;

public class Hero extends Character {
    
    private String name = "勇者";
    
    
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃!!");
        System.out.println("敵に10ポイントのダメージを与えた");
        m.hp -= 10;
    }

}
