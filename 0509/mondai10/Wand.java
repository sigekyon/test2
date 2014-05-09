package mondai10;

public class Wand {
    private String name; //杖の名前
    private double power; //杖の魔力
    
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException("エラーメッセージ");
        }

        this.name = name;
    }
    
    public double getPower() {
        
        if(power < 0.5 || power > 100.0){
            throw new IllegalArgumentException("エラーメッセージ");            
        }
        
        return power;
    }
    
    public void setPower(double power){
        this.power = power;
    }
}