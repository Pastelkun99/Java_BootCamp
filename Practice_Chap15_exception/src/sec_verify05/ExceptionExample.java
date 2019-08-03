package sec_verify05;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("나뉨수를 입력하시오 : ");
		int num1 = scanner.nextInt();
		System.out.print("나눔수를 입력하시오 : ");
		int num2 = scanner.nextInt();
	
		try {
			int result = num1/num2;
			System.out.println("나눗셈의 결과 : " + result);
		}
		catch (Exception e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
	}

}
