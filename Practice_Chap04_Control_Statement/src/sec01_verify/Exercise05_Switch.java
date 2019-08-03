package sec01_verify;

import java.util.Scanner;

public class Exercise05_Switch {

	public static void main(String[] args) {

		System.out.println("직급은 아래와 같습니다.");
		System.out.println("1. 상무");
		System.out.println("2. 부장");
		System.out.println("3. 차장");
		System.out.println("4. 과장");
		System.out.println("5. 대리");
		System.out.println("6. 사원\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("알고싶은 월급 중 해당직급을 입력하세요 : ");
		int position = scanner.nextInt();
		scanner.close();

		switch (position) {
		case 1:
			System.out.print("상무직급은 1000만원/월 입니다.");
			break;
		case 2:
			System.out.print("부장직급은 800만원/월 입니다.");
			break;
		case 3:
			System.out.print("차장직급은 600만원/월 입니다.");
			break;
		case 4:
			System.out.print("과장직급은 400만원/월 입니다.");
			break;
		case 5:
			System.out.print("대리직급은 250만원/월 입니다.");
			break;
		case 6:
			System.out.print("사원직급은 180만원/월 입니다.");
			break;
		}

	}

}
