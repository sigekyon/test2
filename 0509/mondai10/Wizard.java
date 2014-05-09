package mondai10;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    void heal(Hero h) {
        int basePoint = 10; //��{�񕜃|�C���g
        int recoverPoint = (int)(basePoint * this.getWand().getPower()); //��ɂ�鑝��
        h.setHp(h.getHp() + recoverPoint); //�E�҂�HP���񕜂�����
        System.out.println(h.getName() + "��HP��" + recoverPoint + "�񕜂���!!");
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHP(int hp) {
        
        if(hp < 0){
            this.hp = 0;
        }
        else{
            this.hp = hp;
        }
        
        this.hp = hp;
    }
    
    public int getMp() {
        return mp;
    }
    
    public void setMp(int mp) {
        
        if(mp < 0){
            throw new IllegalArgumentException("�G���[���b�Z�[�W");
        }
        
        this.mp = mp;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException("�G���[���b�Z�[�W");
        }

        this.name = name;
    }
    
    public Wand getWand() {
        return wand;
    }
    
    public void setWand(Wand wand) {
        
        if(wand == null){
            throw new IllegalArgumentException("�G���[���b�Z�[�W");
        }
        
        this.wand = wand;
    }
}
