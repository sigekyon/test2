package rist1307;

public class Main {
    
    public static void main (String[] args) {
        
        Character[] c = new Character[5];
        
        c[0] = new Hero();
        c[1] = new Hero();
        c[2] = new Thief();
        c[3] = new Wizard();
        c[4] = new Wizard();
        
        //h‚É”‘‚Ü‚é
        for (Character ch:c){
            ch.addHp(50);
        }
        
        
    }

}
