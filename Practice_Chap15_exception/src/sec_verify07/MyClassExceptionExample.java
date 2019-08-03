package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {

		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 정수를 입력하세요.(종료를 원하면 -1 입력)");
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
			System.out.println("입력한 정수는 " + num + "입니다.");
		}
		else if (num < -1 || num > 100) {
			System.out.println("score값이 범위(0 <= x <= 100)를 벗어났습니다.");
			throw new MyException("예외가 발생했지만, 프로그램 정상 종료");	
		}
		else if(num == -1) {
			System.out.println("-1을 입력하셨군요. 프로그램을 종료합니다.");
			System.exit(0);
		}		
	}
}
	
