package sec01_verify;

import java.util.Scanner;

public class Exercise02_If {

	public static void main(String[] args) {

		// ifelse 구문을 사용하였습니다.

		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하시오. >> ");
		int month = scanner.nextInt();
		scanner.close();

		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월은 winter입니다.");
		} else if (month >= 3 && month < 6) {
			System.out.println(month + "월은 spring입니다.");
		} else if (month >= 6 && month < 9) {
			System.out.println(month + "월은 summer입니다.");
		} else if (month >= 9 && month < 12) {
			System.out.println(month + "월은 fall입니다.");
		}

	}

}
