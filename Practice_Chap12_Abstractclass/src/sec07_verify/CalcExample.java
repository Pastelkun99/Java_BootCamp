package sec07_verify;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		
		
		while(true) {
		
		System.out.println("두 정수와 연산자를 입력하시오.");
		System.out.print("(종료를 원하시면 -1을 입력해주세요.) >> ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		String operator = scanner.next();
		
		switch(operator) {
		case "+" : 
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(a + " + " + b + " = " + add.calculate());
			System.out.println();
			break;
		case "-" : 
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(a + " - " + b + " = " + sub.calculate());
			System.out.println();
			break;
		case "*" : 
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(a + " * " + b + " = " + mul.calculate());
			System.out.println();
			break;
		case "/" : 
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(a + " / " + b + " = " + div.calculate());
			System.out.println();
			break;
		default : 
			System.out.println("잘못된 연산자입니다.");
			System.out.println();
			}
		}
	}
}
