package rensyu;

public class mondai5d {

    public static void main(final String[] args) {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        double TriangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("�O�p�`�̖ʐς́A" + TriangleArea + "����cm");
        
        double CircleArea = calcCircleArea(5.0);
        System.out.println("�~�̖ʐς́A" + CircleArea + "����cm");
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