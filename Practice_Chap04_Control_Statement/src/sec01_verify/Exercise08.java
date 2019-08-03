package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("하나의 정수를 입력하세요 :");
		num = scanner.nextInt();
		scanner.close();

		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println(num + "은 2와 3의 배수입니다.");
		} else if (num % 2 == 0) {
			System.out.println(num + "은 2의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다.");
		} else if (num % 5 == 0) {
			System.out.println(num + "은 5의 배수입니다.");
		} else if (num % 7 == 0) {
			System.out.println(num + "은 7의 배수입니다.");
		} else {
			System.out.println("배수가 아닙니다.");
		}

	}

}
