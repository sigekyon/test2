package mondai08;

import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp =10;
    final int MAXMP = 10;
    
    public void selfAid(){
        System.out.println(this.name + "�Z���t���C�h���g����");
        this.hp = this.MAXHP;
        this.mp -= 5;
        System.out.println("HP���񕜂���");
    }
    
    public void pray(int sec){
        System.out.println(this.name + "�́A" + sec + "�b�F����");
        
        int recover = new Random().nextInt(3) + sec;
        
        int recoverActual = Math.min(this.MAXMP - this.mp, recover);
        
        this.mp += recoverActual;
        System.out.println("MP��" + recoverActual + "�񕜂���");
        return;
    }
}
