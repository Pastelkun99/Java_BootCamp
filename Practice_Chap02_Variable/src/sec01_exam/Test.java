package sec01_exam;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		int a = 1000000;
		int b = 1000000;
		long c = (long)a*b;
		System.out.println("�� = " + c);
		
	
		float pi = 3.141592f;
		double shortPi = Math.round(pi*100)/100.0;
		System.out.println("�Ҽ��� = " + shortPi);
		/*Math.round(3.141592f*1000)/1000f;
		Math.round(3141.592f)/1000f;*/
		
		System.out.println("9 >> 2 = " + (9>>2)); // �ڸ�����ŭ�� 0�� ����Ʈ��.
		System.out.println("7 << 3 = " + (7<<3));
		}
}