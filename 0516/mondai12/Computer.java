package mondai12;

public class Computer extends TangibleAsset {
    
    private String makerName;
    
    public Computer(String name,int price,String color,String makerName) {
        
        super(name,price,color);
        this.makerName = makerName;
    }
      
    public String getMakerName() {
        return this.makerName;
    }

    @Override
    public void setWeight(double weight) {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        
    }

}
