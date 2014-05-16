package rist12;

public class Hero extends Character {
    
    private String name = "—EÒ";
    
    public void attack(Matango m) {
        System.out.println(this.name + "‚ÌUŒ‚!!");
        System.out.println("“G‚É10ƒ|ƒCƒ“ƒg‚Ìƒ_ƒ[ƒW‚ğ—^‚¦‚½!!");
        m.hp -= 10;
    }
    
}
