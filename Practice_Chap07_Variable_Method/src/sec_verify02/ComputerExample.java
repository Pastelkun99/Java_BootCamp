package sec_verify02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		System.out.print("1���� �迭�� ����ϴ�. �迭 ���� �Է� : ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.println("�ش� �迭 ���� ������ �Է��ϼ���. : ");
		int[] values = new int[input];
		int num;
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "] = ");
			num = scanner.nextInt();
			values[i] = num;
		}
		
		System.out.println("Computer �ν��Ͻ� ����޼��� sum�� ȣ���� ����� " + com.sum(values) + "�Դϴ�.");
		scanner.close();
	}

}
