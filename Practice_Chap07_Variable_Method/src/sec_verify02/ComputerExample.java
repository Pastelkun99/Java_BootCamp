package sec_verify02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		Computer com = new Computer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1���� �迭�� ����ϴ�.");
		System.out.print("�ش� �迭�� ���� ���� �Է��ϼ���. : ");
		int input = scanner.nextInt();
		int[] values = new int[input];
		int num;

		for (int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "] = ");
			num = scanner.nextInt();
			values[i] = num;
		}
		
		System.out.println("�Է��Ͻ� 1���� �迭�� ���� ����մϴ�.");
		for(int j = 0; j<values.length; j++) {
			System.out.println("values["+j+"] = " + values[j]);
		}

		System.out.println("Computer �ν��Ͻ� ����޼��� sum�� ȣ���� ����� " + com.sum(values) + "�Դϴ�.");
		scanner.close();
	}

}
