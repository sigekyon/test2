package rensyu;

public class rist0601 {

    public static void main(String[] args) {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        int a = 10;
        int b = 2;
        int total = tasu(a, b);
        int delta = hiku(a, b);
        
        System.out.println("��������" + total + "�A��������" + delta);

    }
    
    public static int tasu(int a,int b){
        return (a + b);
    }
    
    public static int hiku(int a,int b){
        return (a - b);
    }

}
