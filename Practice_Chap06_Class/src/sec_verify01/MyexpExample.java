package sec_verify01;

import java.util.Scanner;

public class MyexpExample {

	public static void main(String[] args) {

		Myexp num = new Myexp();

		System.out.print("�� : ");
		Scanner scanner = new Scanner(System.in);
		num.base = scanner.nextInt();
		System.out.print("���� : ");
		num.exp = scanner.nextInt();

		num.getValue();
		System.out.println(num.base + "�� " + num.exp + "�� : " + num.a);
		scanner.close();
	}

}
