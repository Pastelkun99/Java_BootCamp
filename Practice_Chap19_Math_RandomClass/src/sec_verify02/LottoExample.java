package sec_verify02;

public class LottoExample {

	public static void main(String[] args) {
		
		System.out.println("�ζ� ��ȣ ������ ���α׷��Դϴ�.");
		System.out.println("�ڵ����� ��ȣ�� �����մϴ�.");
		
		int lotto[] = new int[6];
		int lottowin[] = new int[] {14, 22, 22, 10, 22, 27};
		System.out.println();
		System.out.print("���� ��ȣ : ");
		
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
		System.out.println();
		
		System.out.println("��÷ ��ȣ : 14 22 22 10 22 27");
		//�ϳ��� ���� ������ �� ó����.
		
		if(lotto[1] != lottowin[1]);
		System.out.println("��÷ ���� : ��÷���� �ʾҽ��ϴ�.");
	}
}

