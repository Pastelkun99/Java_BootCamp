package sec01_verify;

import java.util.Scanner;

public class Exercise07_1 {

	public static void main(String[] args) {

		// �ݺ����� ������� �ʰ� �ڵ��� ��. ��Ȯ�� 2�� 11�� �ɷȴ�.
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է��Ͻʽÿ�.");
		i = scanner.nextInt();

		System.out.println(i + " * 1 = " + (i * 1));
		System.out.println(i + " * 2 = " + (i * 2));
		System.out.println(i + " * 3 = " + (i * 3));
		System.out.println(i + " * 4 = " + (i * 4));
		System.out.println(i + " * 5 = " + (i * 5));
		System.out.println(i + " * 6 = " + (i * 6));
		System.out.println(i + " * 7 = " + (i * 7));
		System.out.println(i + " * 8 = " + (i * 8));
		System.out.println(i + " * 9 = " + (i * 9));
		scanner.close();
	}

}
