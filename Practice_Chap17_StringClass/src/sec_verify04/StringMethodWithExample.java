package sec_verify04;

import java.util.Scanner;

public class StringMethodWithExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڿ� �Է� ==> ");
		String str = scanner.nextLine();
		
		if(str.startsWith("(") == false || str.endsWith(")") == false) {
			System.out.println("�Է� ���ڿ��� ���۰� ���� ���� '(' ')'�� �ƴϸ�, '(' ')' �ٿ� ����մϴ�.");
			System.out.println("��� ���ڿ� ==> (" + str + ")");
		}
		else {
			System.out.println("��� ���ڿ� ==> " + str);
		}
		
		scanner.close();
	}

}
