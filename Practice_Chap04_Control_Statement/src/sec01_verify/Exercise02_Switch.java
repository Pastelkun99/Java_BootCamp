package sec01_verify;

import java.util.Scanner;

public class Exercise02_Switch {

	public static void main(String[] args) {

		// switch ������ ����Ͽ����ϴ�.

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�. >> ");
		int month = scanner.nextInt();
		scanner.close();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���� spring�Դϴ�.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println(month + "���� summer�Դϴ�.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(month + "���� fall�Դϴ�.");
			break;

		case 1:
		case 2:
		case 12:
			System.out.println(month + "���� winter�Դϴ�.");
			break;
		}
	}

}
