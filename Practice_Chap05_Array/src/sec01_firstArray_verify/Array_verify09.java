package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] a = new String[] { "50000", "10000", "5000", "1000", "100", "50", "10", "5", "1" };

		int money;
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money = scanner.nextInt();

		for (int i = 0; i < 4; i++) {
			int m = Integer.parseInt(a[i]); // ���ڿ� ���� ���ڷ� ��ȯ�ϴµ� ���
			System.out.println(m + "���� " + (money / m) + "��"); // 50000, 10000, 5000, 1000���� ���
			money %= m;
		}

		for (int i = 4; i < a.length; i++) // a.length = 9; 5��
		{
			int m = Integer.parseInt(a[i]);
			System.out.println(m + "��¥�� ���� " + (money / m) + "��"); // 100, 50, 10, 5, 1�� ���� ���
			money %= m;
		}
		scanner.close();

	}

}
