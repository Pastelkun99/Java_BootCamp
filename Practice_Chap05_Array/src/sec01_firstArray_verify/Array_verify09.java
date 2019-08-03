package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] a = new String[] { "50000", "10000", "5000", "1000", "100", "50", "10", "5", "1" };

		int money;
		System.out.print("금액을 입력하시오 >> ");
		money = scanner.nextInt();

		for (int i = 0; i < 4; i++) {
			int m = Integer.parseInt(a[i]); // 문자열 값을 숫자로 변환하는데 사용
			System.out.println(m + "원권 " + (money / m) + "매"); // 50000, 10000, 5000, 1000원권 계산
			money %= m;
		}

		for (int i = 4; i < a.length; i++) // a.length = 9; 5번
		{
			int m = Integer.parseInt(a[i]);
			System.out.println(m + "원짜리 동전 " + (money / m) + "개"); // 100, 50, 10, 5, 1원 동전 계산
			money %= m;
		}
		scanner.close();

	}

}
