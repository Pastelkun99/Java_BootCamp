package sec_verify06;

public class NumberExceptionExample {

	public static void main(String[] args) {

		String[] stringnumber = {"23", "12", "998", "java"};
		
		int value = 0;
		
		try {
			for(int i = 0; i<stringnumber.length; i++) {
				value = Integer.parseInt(stringnumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� : " + value);
			}
			
		}
		catch (Exception e) {
			System.out.println("���� �߻� : ������ ��ȯ�� �� �����ϴ�.");
		}
	}

}
