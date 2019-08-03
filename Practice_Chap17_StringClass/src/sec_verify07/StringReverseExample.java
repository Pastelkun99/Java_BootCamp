package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		
		System.out.print("문자열을 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
	
		System.out.print("내용을 거꾸로 출력 : ");
		for(int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		scanner.close();
	}
}
