package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		
		//numberformatexception 발생, 이유는? 문자열에 문자가 포함되어있어 숫자로 변환불가
		int value2 = Integer.parseInt(data2);
		
		
	}

}
