package sec01_verify;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// ���׿����ڸ� ����Ͽ����ϴ�.
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
		
		height = height/100;
		bmi = weight / (height*height);
		
		String result = ((bmi >= 20.0) && (bmi <25.0)) ? pass : notpass;
		System.out.println(result);

	}

}
