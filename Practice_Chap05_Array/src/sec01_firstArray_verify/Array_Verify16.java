package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify16 {

	public static void main(String[] args) {

		String correctpassword = "code";

		while (true) {
			System.out.println("��ȣ 4�ڸ� �Է��ϼ���.");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String inputpassword = scanner.next();

			if (correctpassword.equals(inputpassword)) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
				System.out.println("���θ³���?");
			}

		}

	}

}
