package rist12;

public class Fool extends Character implements Human{
    
    //Character����hp��getName()�Ȃǂ̃����o���p�����Ă���
    //Character����p���������ۃ��\�b�hattack()������
    
    public void attack(Matango m){
        System.out.println(this.getName() + "�́A��킸�V��ł���B");
    }
    
    //�����Human����p������4�̒��ۃ��\�b�h������
    
    public void talk(){
        
    }
    
    public void watch(){
        
    }
    
    public void hear(){
        
    }
    
    public void run(){
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(){
        this.name = name;
    }

}
