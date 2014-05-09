package mondai11b;

public class Hero {
    
    private String name = "ミナト";
    private int hp = 100;
    
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃!!");
        m.setHp(m.getHp() - 5);
        System.out.println("5ポイントのダメージを与えた!!");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った!!");
        System.out.println("HPが" + sec + "ポイント回復した。");
    }
    
    public final void slip(){
        this.hp -= 5;
        System.out.println(this.getName() + "は転んだ!!");
        System.out.println("5のダメージ");
    }
    
    public void run(){
        System.out.println(this.name + "は逃げ出した!!");
    }

    private void die(){
        System.out.println(this.name + "は死んでしまった!!");
        System.out.println("GAME OVERです。。。");
    }

    public String getName() {
        return this.name;
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
    
    public Hero() {
//        System.out.println("Heroのコンストラクタが動作");
    }

}
