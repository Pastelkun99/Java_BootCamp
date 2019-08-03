package sec01_verify;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		int tot = 0;
		int subject1 = 0;
		int subject2 = 0;
		int subject3 = 0;
		double avg = 0.0;
		char grade;

		System.out.print("세 과목 점수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		subject1 = scanner.nextInt();
		subject2 = scanner.nextInt();
		subject3 = scanner.nextInt();
		scanner.close();

		tot = subject1 + subject2 + subject3;
		avg = tot / 3;

		if (avg == 100 && avg >= 95.0) {
			grade = 'A';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade + "+");
		}
		else if (avg < 95.0 && avg >= 90.0) {
			grade = 'A';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade);
		}
		else if (avg < 90.0 && avg >= 85.0) {
			grade = 'B';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade + "+");
		}
		else if (avg < 85.0 && avg >= 80.0) {
			grade = 'B';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade);
		}
		else if (avg < 80.0 && avg >= 75.0) {
			grade = 'C';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade + "+");
		}
		else if (avg < 75.0 && avg >= 70.0) {
			grade = 'C';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade);
		}
		else if (avg < 70.0 && avg >= 65.0) {
			grade = 'D';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade + "+");
		}
		else if (avg < 65.0 && avg >= 60.0) {
			grade = 'D';
			System.out.println("당신의 점수: " + avg + ", 당신의 학점은: " + grade);
		}
		else {
			System.out.println("당신의 점수: " + avg + " 당신은 낙제하셨습니다.");
		}

	}

}
