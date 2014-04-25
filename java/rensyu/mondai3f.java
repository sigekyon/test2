package rensyu;

public class mondai3f {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("数当てゲーム");
		
		int ans = new java.util.Random().nextInt(9);
		
		for(int i = 0; i < 5; i++){
		
		System.out.println("0~9の数字を入れて下さい。");
		
		int num = new java.util.Scanner(System.in).nextInt();
		
			if (num == ans){
			
				System.out.println("アタリ!!");
			}
			else if(num != ans){
			
				System.out.println("ハズレ!!");
			}

		}
		
		System.out.println("ゲームを終了します。");
	}

}
