package sec_verify03_1;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ��ǰ�� �Է� �����ðڽ��ϱ�? >> ");

		Goods[] arr = new Goods[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ��ǰ �̸� : ");
			String name = scan.next();

			System.out.print(i + 1 + "��° ��ǰ ���� : ");
			int price = scan.nextInt();

			System.out.print(i + 1 + "��° ��ǰ ��� : ");
			int stock = scan.nextInt();

			System.out.print(i + 1 + "��° �ȸ� ��ǰ ���� : ");
			int sold = scan.nextInt();
			arr[i] = new Goods(name, price, stock, sold);
		}

		System.out.println("�Է��Ͻ� ��ǰ�� �̸�, ����, ���, �ȸ� ������ ��Ȳ�Դϴ�.");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}