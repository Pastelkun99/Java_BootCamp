package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		
		System.out.print("���ڿ��� �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
	
		System.out.print("������ �Ųٷ� ��� : ");
		for(int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		scanner.close();
	}
}
