package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		
		System.out.print("���ϴ� ������ �Է��� ������ : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		System.out.println("�Է��� ���ڿ� : [" + str + "]");
		
		str = str.replaceAll(" ", "");
		System.out.println("�������Ÿ� �� ���ڿ� : [" + str + "]");
		
		scanner.close();
	}
}
