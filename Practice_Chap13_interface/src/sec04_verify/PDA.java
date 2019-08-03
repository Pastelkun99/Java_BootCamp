package sec04_verify;

public class PDA {

	public int calculate(int a, int b) {
		int result = 0;
		System.out.print("PDA의 계산기 기능을 이용하여 " + a + "과 " + b + "를 더합니다. ");
		result = a+b;
		System.out.println("결과 : " + result);
		return result;
	}
}
