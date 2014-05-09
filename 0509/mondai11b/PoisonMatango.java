package mondai11b;

public class PoisonMatango extends Matango{
    
    private int PoisonCount = 5;
    
    public PoisonMatango(char suffix){
        super(suffix);
    }
    
    public PoisonMatango() {
        // TODO 自動生成されたコンストラクター・スタブ
    }

    public void attack(Hero h){
        super.attack(h);
        
        if (PoisonCount > 0){
            System.out.println("さらに毒の胞子をばらまいた!");
            int dmg = h.getHp()/5;
            h.setHp(h.getHp() - dmg);
            System.out.println(dmg + "ポイントのダメージを与えた!!");
            this.PoisonCount--;
        }
    }

}
