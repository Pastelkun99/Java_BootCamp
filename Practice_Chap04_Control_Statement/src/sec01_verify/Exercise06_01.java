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
			System.out.println("  1.���� | 2.���� | 3.����");
			System.out.println("-----------------------------");
			System.out.print("���� : ");

			KeyCode = scanner.nextInt();

			if (KeyCode == 1) {
				speed++;
				System.out.println("����ӵ�: " + speed);
			} else if (KeyCode == 2) {
				speed--;
				System.out.println("����ӵ�: " + speed);
			} else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		scanner.close();
	}

}
