package sec_verify01;

import java.util.Scanner;

public class Student extends Person {
	
	private String S_num;
	Scanner scan = new Scanner(System.in);
	
	public Student(String name, String num) {
		super("");
		System.out.print("�й��� �Է��ϼ���. : ");
		this.S_num = scan.next();
	}
	
	@Override
	public String toString() 
	{System.out.println(super.toString());
	return "�й� : " + this.S_num;
	}
}