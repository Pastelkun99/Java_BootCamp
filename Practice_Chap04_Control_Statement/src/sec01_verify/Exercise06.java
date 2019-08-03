package sec01_verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		int num = 0;
		System.out.print("정수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
