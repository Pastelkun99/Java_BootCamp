package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		int total = 0;
		String input;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("��ǰ�ݾ� �Է� : ");
			input = scanner.next();
			if (input.equals("��")) {
				System.out.println("�����Ͻ� ��ǰ���� �� ������ " + total + "�Դϴ�.");
				break;
			} else {
				total += Integer.parseInt(input);
			}
		}

		scanner.close();

	}

}
