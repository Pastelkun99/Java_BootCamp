package sec_verify03;

import java.util.Scanner;

public class StringMethodExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� ==> ");
		String str = scanner.nextLine();
		System.out.println("�Է¹��ڿ��� s�� S�� $�� ��ȯ�մϴ�.");
		str = str.toLowerCase();
		str = str.replace("s", "$");
		
		System.out.println("��� ���ڿ� ==> " + str);
		
		scanner.close();
		
	}
}
