package sec01_verify;

import java.util.Scanner;

public class Exercise05_01_If {

	public static void main(String[] args) {

		System.out.print("������ �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();

		if (score <= 100 && score >= 95) {
			System.out.println("����� ������ : A+");
		} else if (score < 95 && score >= 90) {
			System.out.println("����� ������ : A0");
		} else if (score < 90 && score >= 85) {
			System.out.println("����� ������ : B+");
		} else if (score < 85 && score >= 80) {
			System.out.println("����� ������ : B0");
		} else if (score < 80 && score >= 75) {
			System.out.println("����� ������ : C+");
		} else if (score < 75 && score >= 70) {
			System.out.println("����� ������ : C0");
		} else if (score < 70 && score >= 65) {
			System.out.println("����� ������ : D+");
		} else if (score < 65 && score >= 60) {
			System.out.println("����� ������ : D0");
		} else {
			System.out.println("����� ������ : F");
		}
	}

}
