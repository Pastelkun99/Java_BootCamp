package sec01_verify;

import java.util.Scanner;

public class Exercise01_1 {

	public static void main(String[] args) {

		// ifelse���� ����Ͽ����ϴ�.
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű(m)�Է� : ");
		height = scanner.nextDouble();

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("������(kg)�Է� : ");
		weight = scanner2.nextDouble();

		String pass = "ǥ���Դϴ�.";
		String notpass = "ü�߰����� �ʿ��մϴ�.";

		scanner.close();
		scanner2.close();

		height = height / 100;
		bmi = weight / (height * height);

		if (bmi >= 20 && bmi < 25) {
			System.out.println(pass);
		} else {
			System.out.println(notpass);
		}
	}

}
