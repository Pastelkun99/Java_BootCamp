package sec_verify02;

public class WrapperExample {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		
		char c = '4';
			
		Double d = new Double(3.1234566);
		
		System.out.println("대문자 A를 소문자로 변환 : " + Character.toLowerCase('A'));
		System.out.println("문자 c를 숫자로 변환하여 출력 : " + c);
		System.out.println("문자열 -123을 정수로 변환하여 출력 : " + Integer.parseInt("-123"));
		System.out.println("16진수로 표현된 문자열 10을 정수로 변환하여 출력 : " + Integer.parseInt("10", 16));
		System.out.println("28의 2진수 표현을 나타내는 문자열 출력 : " + Integer.toBinaryString(28));
		System.out.println("28의 2진수에서 1의 갯수를 출력 : " + Integer.bitCount(28));
		System.out.println("28의 16진수 표현을 나타내는 문자열 출력 : " + Integer.toHexString(28));
		System.out.println("i 값을 double로 변환하여 출력 : " + (double)i);
		System.out.println("d 값을 문자열로 변환하여 출력 : " + d.toString());
		System.out.println("문자열 44.13e-16을 double로 변환하여 출력 : " + Double.parseDouble("44.13e-16"));
		
	}
}
