package sec_verify05;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� : ");
		int num1 = scanner.nextInt();
		System.out.print("�������� �Է��Ͻÿ� : ");
		int num2 = scanner.nextInt();
	
		try {
			int result = num1/num2;
			System.out.println("�������� ��� : " + result);
		}
		catch (Exception e) {
			System.out.println("���� �߻� : 0���� ���� �� �����ϴ�.");
		}
	}

}
