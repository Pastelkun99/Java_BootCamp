package sec01_verify;

import java.util.Scanner;

public class Exercise02_Switch {

	public static void main(String[] args) {

		// switch 구문을 사용하였습니다.

		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하시오. >> ");
		int month = scanner.nextInt();
		scanner.close();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 spring입니다.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 summer입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 fall입니다.");
			break;

		case 1:
		case 2:
		case 12:
			System.out.println(month + "월은 winter입니다.");
			break;
		}
	}

}
