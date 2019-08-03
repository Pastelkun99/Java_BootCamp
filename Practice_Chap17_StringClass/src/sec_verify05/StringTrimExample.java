package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		
		System.out.print("원하는 문장을 입력해 보세요 : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		System.out.println("입력한 문자열 : [" + str + "]");
		
		str = str.replaceAll(" ", "");
		System.out.println("공백제거를 한 문자열 : [" + str + "]");
		
		scanner.close();
	}
}
