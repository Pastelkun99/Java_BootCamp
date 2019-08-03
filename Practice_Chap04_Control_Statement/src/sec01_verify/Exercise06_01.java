package sec01_verify;

import java.util.Scanner;

public class Exercise06_01 {

	public static void main(String[] args) {

		boolean run = true;
		int speed = 0;
		int KeyCode = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("-----------------------------");
			System.out.println("  1.증속 | 2.감속 | 3.중지");
			System.out.println("-----------------------------");
			System.out.print("선택 : ");

			KeyCode = scanner.nextInt();

			if (KeyCode == 1) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if (KeyCode == 2) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scanner.close();
	}

}
