package sec_verify06;

public class NumberExceptionExample {

	public static void main(String[] args) {

		String[] stringnumber = {"23", "12", "998", "java"};
		
		int value = 0;
		
		try {
			for(int i = 0; i<stringnumber.length; i++) {
				value = Integer.parseInt(stringnumber[i]);
				System.out.println("숫자로 변환한 값은 : " + value);
			}
			
		}
		catch (Exception e) {
			System.out.println("예외 발생 : 정수로 변환할 수 없습니다.");
		}
	}

}
