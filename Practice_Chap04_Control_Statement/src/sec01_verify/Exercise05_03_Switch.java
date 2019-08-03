package sec01_verify;

import java.util.Scanner;

public class Exercise05_03_Switch {

	public static void main(String[] args) {

		int basic;
		double price;
		double tax;
		double total;

		System.out.print("���� ��뷮�� �Է��ϼ���(kw) : ");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		scanner.close();

		switch ((amount - 1) / 100) {
		case 0:
			basic = 370;
			price = (amount * 52.0);
			break;
		case 1:
			basic = 660;
			price = (100 * 52.0);
			price += (amount - 100) * 88.5;
			break;
		case 2:
			basic = 1130;
			price = (100 * 52.0) + (100 * 88.5);
			price += (amount - 200) * 127.8;
			break;
		case 3:
			basic = 2710;
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8);
			price += (amount - 300) * 184.3;
			break;
		case 4:
			basic = 5130;
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3);
			price += (amount - 400) * 274.3;
			break;
		default:
			basic = 9330;
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3) + (100 * 274.3);
			price += (amount - 500) * 494.0;
			break;
		}

		tax = (basic + price) * 0.09;

		total = basic + price + tax;

		System.out.println("�̹� �� ����� " + Math.round(total * 10) / 10 + "�� �Դϴ�.");

		// �⺻��� + (��뷮 * kw�� ���) + ����
		// ���� = (�⺻��� + kw�� ���) * 0.09

	}

}
