package rist09a;

public class Main {

    public static void main(String[] args) {
         
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        // 1.勇者を生成
        Hero h = new Hero();
        
        Hero.money = 100;
        System.out.println("所持金：" + Hero.money);
        
        // 2.フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        
        System.out.println("勇者" + h.name + "を生み出しました！");
        
        System.out.println("現在の武器は" + h.sword.name);
        
        w.heal(h);
        
        // 3.勇者のメソッドを呼び出してゆく
        h.attack();
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }

}
