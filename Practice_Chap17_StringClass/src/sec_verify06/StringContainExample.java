package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		
		System.out.print("ù ��° ������ �Է��غ����� : ");
		Scanner scanner1 = new Scanner(System.in);
		String str1 = scanner1.nextLine();
		
		System.out.print("�� ���� ������ �Է��غ����� : ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner2.nextLine();
		
		System.out.println("���ڿ� 1 : [" + str1 + "]");
		System.out.println("���ڿ� 2 : [" + str2 + "]");
		
		if(str1.equals(str2)) {
			System.out.println("�Է��� �� ������ ���� �����̳׿�.");
		}
		else {
			System.out.println("�Է��� �� ������ �ٸ� �����̳׿�.");
		}
		
		if(str1.indexOf("Java") != -1 & str2.indexOf("Java") != -1) {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ� �ֳ׿�.");
		}
		else {
			System.out.println("�Է��� �� ���� �� ��� �ϳ��� Java�� ���ԵǾ� ���� �ʳ׿�.");
		}
		scanner1.close();
		scanner2.close();
		
	}
}
