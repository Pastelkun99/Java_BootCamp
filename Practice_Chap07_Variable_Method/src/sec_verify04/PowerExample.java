package sec_verify04;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
			
		  Scanner scan = new Scanner(System.in);

		  System.out.println("���������� ���� ����մϴ�.");
		  System.out.println("ex) 2�� 3�� : 2��1�� + 2��2�� + 2��3���� 14�Դϴ�.");
		  System.out.print("�����ϰ� ���� ���� �Է� : ");
		  int x=scan.nextInt();
		  System.out.print("����� ���ұ��? : ");
		  int n=scan.nextInt();
	
		  System.out.println(x + "�� " + n + "�� ������ �� = " + Power.power(x, n));
		  scan.close();

	}

}
