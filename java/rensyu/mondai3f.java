package rensyu;

public class mondai3f {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		System.out.println("�����ăQ�[��");
		
		int ans = new java.util.Random().nextInt(9);
		
		for(int i = 0; i < 5; i++){
		
		System.out.println("0~9�̐��������ĉ������B");
		
		int num = new java.util.Scanner(System.in).nextInt();
		
			if (num == ans){
			
				System.out.println("�A�^��!!");
			}
			else if(num != ans){
			
				System.out.println("�n�Y��!!");
			}

		}
		
		System.out.println("�Q�[�����I�����܂��B");
	}

}
