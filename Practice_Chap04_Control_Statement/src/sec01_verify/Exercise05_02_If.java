package sec01_verify;

import java.util.Scanner;

public class Exercise05_02_If {

	public static void main(String[] args) {

		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (011231-1111222) : ");
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		scanner.close();

		char gender = regNo.charAt(7);

		if (gender == '1') {
			System.out.println("����� 2000��� ������ �¾ �����Դϴ�.");
		} else if (gender == '2') {
			System.out.println("����� 2000��� ������ �¾ �����Դϴ�.");
		} else if (gender == '3') {
			System.out.println("����� 2000��� ���Ŀ� �¾ �����Դϴ�.");
		} else if (gender == '4') {
			System.out.println("����� 2000��� ���Ŀ� �¾ �����Դϴ�.");
		}

	}

}
