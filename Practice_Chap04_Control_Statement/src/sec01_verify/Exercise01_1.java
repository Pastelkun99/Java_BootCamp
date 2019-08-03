package sec01_verify;

import java.util.Scanner;

public class Exercise01_1 {

	public static void main(String[] args) {

		// ifelse문을 사용하였습니다.
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("키(m)입력 : ");
		height = scanner.nextDouble();

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("몸무게(kg)입력 : ");
		weight = scanner2.nextDouble();

		String pass = "표준입니다.";
		String notpass = "체중관리가 필요합니다.";

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
