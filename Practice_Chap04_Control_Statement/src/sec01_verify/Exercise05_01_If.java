package sec01_verify;

import java.util.Scanner;

public class Exercise05_01_If {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();

		if (score <= 100 && score >= 95) {
			System.out.println("당신의 학점은 : A+");
		} else if (score < 95 && score >= 90) {
			System.out.println("당신의 학점은 : A0");
		} else if (score < 90 && score >= 85) {
			System.out.println("당신의 학점은 : B+");
		} else if (score < 85 && score >= 80) {
			System.out.println("당신의 학점은 : B0");
		} else if (score < 80 && score >= 75) {
			System.out.println("당신의 학점은 : C+");
		} else if (score < 75 && score >= 70) {
			System.out.println("당신의 학점은 : C0");
		} else if (score < 70 && score >= 65) {
			System.out.println("당신의 학점은 : D+");
		} else if (score < 65 && score >= 60) {
			System.out.println("당신의 학점은 : D0");
		} else {
			System.out.println("당신은 학점은 : F");
		}
	}

}
