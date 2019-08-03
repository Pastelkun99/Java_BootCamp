package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify12 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-------------------------------------------------------------");
			System.out.print("���� > ");

			int select = scanner.nextInt();

			if (select == 1) {
				System.out.print("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (select == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			}

			else if (select == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}

			else if (select == 4) {
				int max = 0;
				int sum = 0;
				double avarage = 0;

				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i] ? scores[i] : max);
					sum += scores[i];
				}
				avarage = (double) sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avarage);
			}

			else if (select == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
