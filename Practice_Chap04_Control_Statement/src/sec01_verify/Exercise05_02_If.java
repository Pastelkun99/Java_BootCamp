package sec01_verify;

import java.util.Scanner;

public class Exercise05_02_If {

	public static void main(String[] args) {

		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) : ");
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		scanner.close();

		char gender = regNo.charAt(7);

		if (gender == '1') {
			System.out.println("당신은 2000년대 이전에 태어난 남자입니다.");
		} else if (gender == '2') {
			System.out.println("당신은 2000년대 이전에 태어난 여자입니다.");
		} else if (gender == '3') {
			System.out.println("당신은 2000년대 이후에 태어난 남자입니다.");
		} else if (gender == '4') {
			System.out.println("당신은 2000년대 이후에 태어난 여자입니다.");
		}

	}

}
