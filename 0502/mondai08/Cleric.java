package mondai08;

import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp =10;
    final int MAXMP = 10;
    
    public void selfAid(){
        System.out.println(this.name + "セルフレイドを使った");
        this.hp = this.MAXHP;
        this.mp -= 5;
        System.out.println("HPが回復した");
    }
    
    public void pray(int sec){
        System.out.println(this.name + "は、" + sec + "秒祈った");
        
        int recover = new Random().nextInt(3) + sec;
        
        int recoverActual = Math.min(this.MAXMP - this.mp, recover);
        
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return;
    }
}
