package rensyu;

public class rist0513 {
    // int �^�z����󂯎��A
    // �z����̗v�f���ׂĂ�1�������郁�\�b�h
    public static void incArray (int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            array[i]++;
        }
    }
    public static void main (String[] args) {
        int[] array = {1, 2, 3};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
