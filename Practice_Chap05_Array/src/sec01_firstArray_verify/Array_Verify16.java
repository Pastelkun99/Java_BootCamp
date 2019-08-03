package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify16 {

	public static void main(String[] args) {

		String correctpassword = "code";

		while (true) {
			System.out.println("암호 4자를 입력하세요.");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String inputpassword = scanner.next();

			if (correctpassword.equals(inputpassword)) {
				System.out.println("비밀번호가 일치합니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력하세요");
				System.out.println("주인맞나요?");
			}

		}

	}

}
