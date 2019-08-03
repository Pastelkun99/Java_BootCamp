package sec_verify04;

public class ThrowExample {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		
		try {
			//System.out.println(a/b);
			throw new ArithmeticException("0으로 나누려고요? 안됩니다.");			
		}
		catch (Exception e) {
			System.out.println("발생 오류 ==> " + e.getMessage());
		}
	}

}
