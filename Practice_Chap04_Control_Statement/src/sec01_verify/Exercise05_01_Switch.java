package sec01_verify;

import java.util.Scanner;

public class Exercise05_01_Switch {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();

		switch ((int) score / 10) {
		case 10:
			System.out.println("당신의 학점은 A+ 입니다.");
			break;
		case 9:
			System.out.println("당신의 학점은 A 입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B+ 입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 B 입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 C+ 입니다.");
			break;
		case 5:
			System.out.println("당신의 학점은 C 입니다.");
			break;
		default:
			System.out.println("당신은 낙제하셨습니다.");
			break;
		}
	}

}
