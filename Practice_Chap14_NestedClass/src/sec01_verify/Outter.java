package sec01_verify;

public class Outter {

	public Outter() {
		System.out.print("�ܺ�Ŭ���� Outter �� �ν��Ͻ��� ������ ��, ");
	}
	class Inner {
		
		int x = 100;
		public Inner() {
			System.out.println("�ν��Ͻ����Ŭ����(Inner)�� �ν��Ͻ��� �����Ͽ� ����� �� : " + x);
		}
	}
}
