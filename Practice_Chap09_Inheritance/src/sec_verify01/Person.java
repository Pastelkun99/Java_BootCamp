package sec_verify01;

import java.util.Scanner;

public class Person {

	Scanner scan = new Scanner(System.in);

	private String P_name;

	public Person(String name) {
		System.out.print("이름을 입력하세요. : ");
		this.P_name = scan.next();
	}

	@Override
	public String toString() {
		return "이름 : " + this.P_name;
	}
}
