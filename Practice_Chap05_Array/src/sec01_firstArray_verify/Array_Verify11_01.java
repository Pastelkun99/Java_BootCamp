package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify11_01 {

	public static void main(String[] args) {

		String[] str = { "", "�ڼ� �ѹ�", "�ڼ� �ι�" };

		System.out.println("3, 6, 9 ������ �����մϴ�.");
		System.out.print("������� 3,6,9�� �����ұ��? = ");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= input; i++) {
			if (i > 29 && (i % 30 == 3 || i % 30 == 6 || i % 30 == 9)) {
				System.out.println(i + " " + str[2]);
			} else if (i % 3 == 0 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9
					|| (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
				System.out.println(i + " " + str[1]);
			} else {
			}
		}

	}
}