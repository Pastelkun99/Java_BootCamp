package sec01_verify;

import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int num = scanner.nextInt();

		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int finalnum = scanner.nextInt();

		scanner.close();

		System.out.println(num + "(��)�� " + finalnum + "���� 3�� ����� 4�� ����� ������ ���");

		for (num = 0; num <= finalnum; num++) {
			if ((num % 3 == 0) || (num % 4 == 0)) {} 
			else 
				System.out.println(num);
		}

	}

}
