package sec_verify04;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		Computer com = new Computer();
		System.out.println("구하고자하는 원의 반지름을 입력하세요 : ");
		int r = scanner.nextInt();
		System.out.println("Calculator 객체의 areaCircle() 실행");
		System.out.println("원 면적은 : " + cal.areaCircle(r));
		System.out.println();
		System.out.println("Computer 객체의 areaCircle() 실행");
		System.out.println("원 면적은 : " + com.areaCircle(r));
		scanner.close();
	}

}
