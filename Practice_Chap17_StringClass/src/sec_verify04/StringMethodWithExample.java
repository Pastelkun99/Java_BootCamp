package sec_verify04;

import java.util.Scanner;

public class StringMethodWithExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력 ==> ");
		String str = scanner.nextLine();
		
		if(str.startsWith("(") == false || str.endsWith(")") == false) {
			System.out.println("입력 문자열의 시작과 끝이 각각 '(' ')'이 아니면, '(' ')' 붙여 출력합니다.");
			System.out.println("출력 문자열 ==> (" + str + ")");
		}
		else {
			System.out.println("출력 문자열 ==> " + str);
		}
		
		scanner.close();
	}

}
