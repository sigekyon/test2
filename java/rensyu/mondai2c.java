package rensyu;

public class mondai2c {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		System.out.println("�悤�����肢�̊ق�");
		
		System.out.println("���Ȃ��̖��O����͂��ĉ������B");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("���Ȃ��̔N�����͂��ĉ������B");
		String agestring = new java.util.Scanner(System.in).nextLine();
		
		int age = Integer.parseInt(agestring);
		
		int fortune = new java.util.Random().nextInt(3);
		
		fortune++;
		
		System.out.println("�肢�̌��ʂ��o�܂���");
		
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune +"�ł��B");
		
		System.out.println("1:��g�@2:���g�@3:�g�@4:��");
		

	}

}
