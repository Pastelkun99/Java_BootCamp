package sec01_verify;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// 삼항연산자를 사용하였습니다.
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
		
		height = height/100;
		bmi = weight / (height*height);
		
		String result = ((bmi >= 20.0) && (bmi <25.0)) ? pass : notpass;
		System.out.println(result);

	}

}
