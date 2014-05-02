package rist10;

public class Main {

    public static void main(String[] args) {
         
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        // 1.勇者を生成
        Hero h = new Hero();
        
        Hero.setRandomMoney();

        System.out.println("所持金：" + h.money);
        
        // 2.フィールドに初期値をセット
        h.getName();
        h.getHp();
        h.sword = s;
        
//        Wizard w = new Wizard();
//        w.name = "スガワラ";
//        w.hp = 50;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';
                
        System.out.println("勇者" + h.getName() + "を生み出しました！");        
        System.out.println("現在の武器は" + h.sword.name);
        
//        w.heal(h);
        
        System.out.println("お化けキノコが現れた");
        
        // 3.勇者のメソッドを呼び出してゆく
        h.attack();
        h.sit(5);
        h.slip();
        m1.attack();
        h.sit(25);
        m1.attack();
        h.run();
    }

}
