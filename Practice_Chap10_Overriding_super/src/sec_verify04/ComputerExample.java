package sec_verify04;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		Computer com = new Computer();
		System.out.println("���ϰ����ϴ� ���� �������� �Է��ϼ��� : ");
		int r = scanner.nextInt();
		System.out.println("Calculator ��ü�� areaCircle() ����");
		System.out.println("�� ������ : " + cal.areaCircle(r));
		System.out.println();
		System.out.println("Computer ��ü�� areaCircle() ����");
		System.out.println("�� ������ : " + com.areaCircle(r));
		scanner.close();
	}

}
