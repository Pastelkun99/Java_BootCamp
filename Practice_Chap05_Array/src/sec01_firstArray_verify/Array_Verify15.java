package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify15 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int in = 0;
		int count = 0;
		int[] array = new int[100];

		System.out.println("���ϴ� ������ ��� �Է��ϼ��� ( -1�� �Է��ϸ� ���������ϴ�.)");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		in = scanner.nextInt();

		for (int i = 0; i < 100; i++) {
			@SuppressWarnings("resource")
			Scanner scanner2 = new Scanner(System.in);
			array[i] = scanner2.nextInt();

			if (array[i] == -1) {
				break;
			} else {
				count++;
			}
		}
		if (count < 3) {
			System.out.println("������ 3���� ���� ");
			for (int i = 0; i < count; i++) {
				System.out.println(array[i]);
			}
			System.out.println("�̳׿�.");
		} else {
			System.out.println("������ 3���� ����");
			for (int i = count - 3; i < count; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("�̳׿�.");
		}

	}

}
