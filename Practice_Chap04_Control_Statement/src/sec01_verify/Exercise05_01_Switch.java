package sec01_verify;

import java.util.Scanner;

public class Exercise05_01_Switch {

	public static void main(String[] args) {

		System.out.print("������ �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();

		switch ((int) score / 10) {
		case 10:
			System.out.println("����� ������ A+ �Դϴ�.");
			break;
		case 9:
			System.out.println("����� ������ A �Դϴ�.");
			break;
		case 8:
			System.out.println("����� ������ B+ �Դϴ�.");
			break;
		case 7:
			System.out.println("����� ������ B �Դϴ�.");
			break;
		case 6:
			System.out.println("����� ������ C+ �Դϴ�.");
			break;
		case 5:
			System.out.println("����� ������ C �Դϴ�.");
			break;
		default:
			System.out.println("����� �����ϼ̽��ϴ�.");
			break;
		}
	}

}
