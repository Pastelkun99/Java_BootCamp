package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ϳ��� ������ �Է��ϼ��� :");
		num = scanner.nextInt();
		scanner.close();

		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println(num + "�� 2�� 3�� ����Դϴ�.");
		} else if (num % 2 == 0) {
			System.out.println(num + "�� 2�� ����Դϴ�.");
		} else if (num % 3 == 0) {
			System.out.println(num + "�� 3�� ����Դϴ�.");
		} else if (num % 5 == 0) {
			System.out.println(num + "�� 5�� ����Դϴ�.");
		} else if (num % 7 == 0) {
			System.out.println(num + "�� 7�� ����Դϴ�.");
		} else {
			System.out.println("����� �ƴմϴ�.");
		}

	}

}
