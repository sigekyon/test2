package rensyu;

public class rist0511 {
    public static int add (int x , int y ) {
        return x + y;
    }
    
    public static int add (int x , int y , int z ){
        return x + y + z;
    }
    
    public static void main (String[] args ) {
        System.out.println("引数が2つ。10+20=" + add(10 ,20));
        System.out.println("引数が3つ。10+20+30=" + add(10 ,20 ,30));
    }

}
