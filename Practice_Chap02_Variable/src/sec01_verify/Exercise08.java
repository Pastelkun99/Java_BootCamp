package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		System.out.print("num1 입력 : ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		
		System.out.print("num2 입력 : ");
		Scanner scanner2 = new Scanner(System.in);
		double num2 = scanner.nextDouble();
		
		int result = (int)num1 - (int)num2;
		System.out.print("result : " + result);
		
		scanner.close();
		scanner2.close();
	}

}
