package sec01_verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// �ݺ����� �̿��� �ڵ�. ��Ȯ�� 49�� �ɷȴ�. �ڵ嵵 �����ϴ�.
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է��Ͻʽÿ�.");
		num = scanner.nextInt();
		scanner.close();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
