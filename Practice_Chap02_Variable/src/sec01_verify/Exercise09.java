package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		System.out.print("num1 �Է� : ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();

		System.out.print("num2 �Է� : ");
		Scanner scanner2 = new Scanner(System.in);
		double num2 = scanner.nextDouble();
		
		double result1 = num1 + num2;
		double result2 = num1 - num2;
		double result3 = num1 / num2;
		double result4 = num1 * num2;
		
		scanner.close();
		scanner2.close();
		
		System.out.println();
		System.out.println("����� �Ҽ��� ù° �ڸ����� ��Ÿ���ϴ�.");
		System.out.println("result(���ϱ�) : " + Math.round(result1*10)/10.0 );
		System.out.println("result(����) : " + Math.round(result2*10)/10.0 );
		System.out.println("result(������) : " + Math.round(result3*10)/10.0 );
		System.out.println("result(���ϱ�) : " + Math.round(result4*10)/10.0 );
		}

}
