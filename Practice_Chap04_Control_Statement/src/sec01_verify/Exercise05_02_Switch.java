package sec01_verify;

import java.util.Scanner;

public class Exercise05_02_Switch {

	public static void main(String[] args) {
		
		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) : ");
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		scanner.close();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
			System.out.println("당신은 2000년대 이전에 태어난 남자입니다.");
			break;
		case '2':
			System.out.println("당신은 2000년대 이전에 태어난 여자입니다.");
			break;
		case '3':
			System.out.println("당신은 2000년대 이후에 태어난 남자입니다.");
			break;
		case '4':
			System.out.println("당신은 2000년대 이후에 태어난 여자입니다.");
			break;
		}
	}
}
