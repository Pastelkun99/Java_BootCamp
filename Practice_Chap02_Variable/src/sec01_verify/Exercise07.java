package sec01_verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		System.out.print("num1 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();

		System.out.print("num2 입력 : ");
		Scanner scanner2 = new Scanner(System.in);
		int num2 = scanner2.nextInt();
		
		scanner.close();
		scanner2.close();
		
		int result = num1 + num2;
		System.out.println("result : " + result);
		
	}

}
