package sec01_verify;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int res = 0;
		int op = 0;

		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.print("�����ȣ�� �Է��ϼ���. (1: ���ϱ�, 2: ����, 3: ���ϱ�, 4: ������, 5: ������) >> ");
		op = scanner.nextInt();
		switch (op) {
		case 1:
			res = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + res);
			break;
		case 2:
			res = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + res);
			break;
		case 3:
			res = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + res);
			break;
		case 4:
			res = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + res);
			break;
		case 5:
			res = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + res);
			break;
		}
		scanner.close();
	}

}
