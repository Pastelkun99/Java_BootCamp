package sec01_verify;

import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오 : ");
		int num = scanner.nextInt();

		System.out.print("두번째 수를 입력하세요 : ");
		int finalnum = scanner.nextInt();

		scanner.close();

		System.out.println(num + "(와)과 " + finalnum + "에서 3의 배수와 4의 배수를 제외한 결과");

		for (num = 0; num <= finalnum; num++) {
			if ((num % 3 == 0) || (num % 4 == 0)) {} 
			else 
				System.out.println(num);
		}

	}

}
