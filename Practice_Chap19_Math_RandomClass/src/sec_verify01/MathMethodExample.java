package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		
		double number = -2.78987434;
		
		System.out.println("number�� ���� : " + Math.abs(number));
		System.out.println("number�� �ø��� : " + Math.ceil(number));
		System.out.println("number�� ������ : " + Math.floor(number));
		
		System.out.println("9.0�� ������ : " + Math.sqrt(9));
		System.out.println("PI���� ���� ����� ���� : " + Math.rint(Math.PI));
		
		int lotto[] = new int[6];
		
		System.out.print("�̹��� ����� �ζ� ��ȣ�� : ");
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("�Դϴ�.");
	}
}
