package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		System.out.print("num1 입력 : ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();

		System.out.print("num2 입력 : ");
		Scanner scanner2 = new Scanner(System.in);
		double num2 = scanner.nextDouble();
		
		double result1 = num1 + num2;
		double result2 = num1 - num2;
		double result3 = num1 / num2;
		double result4 = num1 * num2;
		
		scanner.close();
		scanner2.close();
		
		System.out.println();
		System.out.println("결과를 소수점 첫째 자리까지 나타냅니다.");
		System.out.println("result(더하기) : " + Math.round(result1*10)/10.0 );
		System.out.println("result(빼기) : " + Math.round(result2*10)/10.0 );
		System.out.println("result(나누기) : " + Math.round(result3*10)/10.0 );
		System.out.println("result(곱하기) : " + Math.round(result4*10)/10.0 );
		}

}
