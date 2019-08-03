package sec01_verify;

import java.util.Scanner;

public class Exercise11_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int input = scanner.nextInt();
		scanner.close();

		int n1 = 1;
		int n2 = 1;
		int n3 = 1;

		System.out.print(input + "까지의 피보나치 수열은 ");

		for (int i = 1; n3 < input; i++) {
			if (i < 3) {
				n3 = 1;
			} else {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
			if (n3 < input) {
				System.out.print(n3 + " ");
			}
		}
		System.out.println("입니다.");
	}
}
