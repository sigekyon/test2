package rensyu;

public class mondai5d {

    public static void main(final String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        double TriangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積は、" + TriangleArea + "平方cm");
        
        double CircleArea = calcCircleArea(5.0);
        System.out.println("円の面積は、" + CircleArea + "平方cm");
    }
    
    public static double calcTriangleArea(final double bottom, final double height) {
        double area = (bottom * height) / 2;
        return area;
    }
    
    public static double calcCircleArea(final double radius) {
        double area = (radius * radius * 3.14);
        return area;
    }

}