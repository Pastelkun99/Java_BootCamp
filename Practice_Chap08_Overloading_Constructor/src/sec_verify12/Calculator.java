package sec_verify12;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int firstnum;
		int secondnum;
		char operator;

		System.out.print("두 정수와 연산자를 입력하시오. >> ");
		firstnum = scanner.nextInt();
		secondnum = scanner.nextInt();
		operator = scanner.next().charAt(0);

		switch (operator) {
		case '+':
			Add add = new Add();
			add.setValue(firstnum, secondnum);
			add.calculate();
			System.out.println(add.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(firstnum, secondnum);
			mul.calculate();
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(firstnum, secondnum);
			div.calculate();
			System.out.println(div.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(firstnum, secondnum);
			sub.calculate();
			System.out.println(sub.calculate());
			break;
		}
		scanner.close();
	}
}
