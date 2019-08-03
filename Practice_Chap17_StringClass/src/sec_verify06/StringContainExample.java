package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		
		System.out.print("첫 번째 문장을 입력해보세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		String str1 = scanner1.nextLine();
		
		System.out.print("두 번쨰 문장을 입력해보세요 : ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner2.nextLine();
		
		System.out.println("문자열 1 : [" + str1 + "]");
		System.out.println("문자열 2 : [" + str2 + "]");
		
		if(str1.equals(str2)) {
			System.out.println("입력한 두 문장은 같은 문장이네요.");
		}
		else {
			System.out.println("입력한 두 문장은 다른 문장이네요.");
		}
		
		if(str1.indexOf("Java") != -1 & str2.indexOf("Java") != -1) {
			System.out.println("입력한 두 문장에는 Java가 포함되어 있네요.");
		}
		else {
			System.out.println("입력한 두 문장 중 적어도 하나에 Java가 포함되어 있지 않네요.");
		}
		scanner1.close();
		scanner2.close();
		
	}
}
