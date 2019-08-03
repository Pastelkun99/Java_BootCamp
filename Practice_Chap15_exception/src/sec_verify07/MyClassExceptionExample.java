package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {

		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 ~ 100 ������ ������ �Է��ϼ���.(���Ḧ ���ϸ� -1 �Է�)");
		int num = scanner.nextInt();
		try {
			doSomething(num);
		} catch (MyException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
	
	public static void doSomething(int num) throws MyException {
		if(num >=0 && num <= 100) {
			System.out.println("�Է��� ������ " + num + "�Դϴ�.");
		}
		else if (num < -1 || num > 100) {
			System.out.println("score���� ����(0 <= x <= 100)�� ������ϴ�.");
			throw new MyException("���ܰ� �߻�������, ���α׷� ���� ����");	
		}
		else if(num == -1) {
			System.out.println("-1�� �Է��ϼ̱���. ���α׷��� �����մϴ�.");
			System.exit(0);
		}		
	}
}
	
