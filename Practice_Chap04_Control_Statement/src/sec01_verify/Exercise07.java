package sec01_verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// 반복문을 이용한 코드. 정확히 49초 걸렸다. 코드도 간단하다.
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 단을 입력하십시오.");
		num = scanner.nextInt();
		scanner.close();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
