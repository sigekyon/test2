package rensyu;

public class mondai5c {
    public static void main (String[] args){
        String address = "���[���̈���̃A�h���X";
        String title = "���[���̃^�C�g��";
        String text = "���[���̖{��";
        email(address, text);
    }
    public static void email(String address,String text) {
        System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
        System.out.println("�u�����v����" );
        System.out.println("�u�{���v" + text);
    }
    public static void email(String address,String title,String text) {
        System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
        System.out.println("�u�����v" + title);
        System.out.println("�u�{���v" + text);
    }

}
