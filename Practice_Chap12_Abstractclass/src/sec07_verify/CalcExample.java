package sec07_verify;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		
		
		while(true) {
		
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�.");
		System.out.print("(���Ḧ ���Ͻø� -1�� �Է����ּ���.) >> ");
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
			System.out.println("�߸��� �������Դϴ�.");
			System.out.println();
			}
		}
	}
}
