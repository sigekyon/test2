package mondai11b;

public class Matango {
    
    private int hp = 50;
    private char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    
    public Matango() {
        // TODO 自動生成されたコンストラクター・スタブ
    }

    public int getHp(){
        return this.hp;
    }
    
    public void setHp(int hp){
        if(hp < 0){
            this.hp = hp;
        }
        
        else{
            this.hp = hp;
        }
    }
    
    public void attack(Hero h){
        System.out.println("キノコ" + this.suffix + "の攻撃!!");
        System.out.println("10のダメージ");
        h.setHp(h.getHp() -10);
    }

}
