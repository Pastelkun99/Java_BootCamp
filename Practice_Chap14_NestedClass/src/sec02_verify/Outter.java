package sec02_verify;

public class Outter {

	public Outter() {
		System.out.println("�ܺ� Ŭ������ �������� �ʰ�, �������Ŭ����(Inner)�� ���� ��� CV �� : " + staticInner.CV);
	}
	
	
	public static class staticInner {
		
		static int CV = 500;
		int iv = 200;
		public staticInner() {
			System.out.println("�ܺ� Ŭ������ �����ϰ�, �������Ŭ����(Inner)�� �ν��Ͻ� ��� IV �� : " + this.iv);
		}
	}
}
