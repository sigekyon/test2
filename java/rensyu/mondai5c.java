package rensyu;

public class mondai5c {
    public static void main (String[] args){
        String address = "メールの宛先のアドレス";
        String title = "メールのタイトル";
        String text = "メールの本文";
        email(address, text);
    }
    public static void email(String address,String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("「件名」無題" );
        System.out.println("「本文」" + text);
    }
    public static void email(String address,String title,String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("「件名」" + title);
        System.out.println("「本文」" + text);
    }

}
