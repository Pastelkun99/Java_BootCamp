package sec_verify04;

public class ThrowExample {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		
		try {
			//System.out.println(a/b);
			throw new ArithmeticException("0���� ���������? �ȵ˴ϴ�.");			
		}
		catch (Exception e) {
			System.out.println("�߻� ���� ==> " + e.getMessage());
		}
	}

}
