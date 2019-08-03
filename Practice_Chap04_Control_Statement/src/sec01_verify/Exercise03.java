package sec01_verify;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int res = 0;
		int op = 0;

		System.out.print("두 개의 정수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.print("연산기호를 입력하세요. (1: 더하기, 2: 빼기, 3: 곱하기, 4: 나누기, 5: 나머지) >> ");
		op = scanner.nextInt();
		switch (op) {
		case 1:
			res = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + res);
			break;
		case 2:
			res = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + res);
			break;
		case 3:
			res = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + res);
			break;
		case 4:
			res = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + res);
			break;
		case 5:
			res = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + res);
			break;
		}
		scanner.close();
	}

}
