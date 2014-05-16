package rist12;

public class KyotoCleaningShop  implements CleaningService{
    //インターフェースを継承しクラスを宣言する場合はimplements
    
    private String ownerName; //店主の名前
    private String address; //住所
    private String phone; //電話番号
    
    public Shirt washShirt (Shirt s){
        // 大型洗濯機 15分
        // 業務用乾燥機　30分
        // スチームアイロン　5分
        
        return s;
    }
    
    public Towl washTowl(Towl t){
        
        return t;
        
    }
    
    public Coat washCoat(Coat c){
        
        return c;
        
    }

}