package mondai10;

public class Wand {
    private String name; //��̖��O
    private double power; //��̖���
    
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException("�G���[���b�Z�[�W");
        }

        this.name = name;
    }
    
    public double getPower() {
        
        if(power < 0.5 || power > 100.0){
            throw new IllegalArgumentException("�G���[���b�Z�[�W");            
        }
        
        return power;
    }
    
    public void setPower(double power){
        this.power = power;
    }
}