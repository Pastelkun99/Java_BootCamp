package sec01_verify;

import java.util.Scanner;

public class Exercise02_If {

	public static void main(String[] args) {

		// ifelse ������ ����Ͽ����ϴ�.

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�. >> ");
		int month = scanner.nextInt();
		scanner.close();

		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "���� winter�Դϴ�.");
		} else if (month >= 3 && month < 6) {
			System.out.println(month + "���� spring�Դϴ�.");
		} else if (month >= 6 && month < 9) {
			System.out.println(month + "���� summer�Դϴ�.");
		} else if (month >= 9 && month < 12) {
			System.out.println(month + "���� fall�Դϴ�.");
		}

	}

}
