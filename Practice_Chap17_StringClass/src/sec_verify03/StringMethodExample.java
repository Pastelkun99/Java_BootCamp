package sec_verify03;

import java.util.Scanner;

public class StringMethodExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력 ==> ");
		String str = scanner.nextLine();
		System.out.println("입력문자열의 s와 S를 $로 변환합니다.");
		str = str.toLowerCase();
		str = str.replace("s", "$");
		
		System.out.println("출력 문자열 ==> " + str);
		
		scanner.close();
		
	}
}
