package sec01_verify;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 99);
		int input = 0;
		int count = 0;
		int min = 0;
		int max = 99;

		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������. : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			count++;
			System.out.print("");
			input = scanner.nextInt();

			if (input == answer) {
				System.out.println("�����Դϴ�.");
				System.out.printf("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				break;
			} else if (input > answer) {
				System.out.println("�� ����");
				max = input;
				System.out.println(min + " >> " + input);
			} else if (input < answer) {
				System.out.println("�� ����");
				min = input;
				System.out.println(input + " >> " + max);

			}

		}

	}

}
