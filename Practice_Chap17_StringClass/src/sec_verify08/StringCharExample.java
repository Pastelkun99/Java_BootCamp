package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {

		System.out.println("���ڿ��� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �����մϴ�.");
		System.out.print("���ڿ��� �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] arr = str.toCharArray();
		
		for(int i=0 ; i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			}
			else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
			
		}
		String converted = String.valueOf(arr);
		System.out.println("��ȯ�� ���ڿ� ==> " + converted);
		scanner.close();
	}
}
