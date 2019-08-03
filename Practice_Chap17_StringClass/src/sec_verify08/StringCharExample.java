package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {

		System.out.println("문자열을 대문자는 소문자로, 소문자는 대문자로 변경합니다.");
		System.out.print("문자열을 입력하세요. : ");
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
		System.out.println("변환된 문자열 ==> " + converted);
		scanner.close();
	}
}
