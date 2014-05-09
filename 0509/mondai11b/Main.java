package mondai11b;

public class Main {

    public static void main(String[] args) {
         
        // 1.勇者を生成
        Hero h = new Hero();
        
//        Matango m = new Matango ();
        
        PoisonMatango m2 = new PoisonMatango ();
                
        // 2.フィールドに初期値をセット
        h.getName();
        h.getHp();
                        
//        System.out.println("勇者" + h.getName() + "を生み出しました！");        

        System.out.println("お化けキノコが現れた");
        
        // 3.勇者のメソッドを呼び出してゆく
        h.attack(m2);
        m2.attack(h);
        h.attack(m2);
        h.slip();
        h.sit(15);
        m2.attack(h);
        h.run();
    }

}
