package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify16_1 {

	public static void main(String[] args) {
		
		String input;
		Scanner scanner = new Scanner(System.in);
		char[] password = new char[] {'c', 'o', 'd', 'e'};
		
		while(true) {
			System.out.println("암호 4자리 입력 : ");
			input = scanner.nextLine();
			if(input.length()<=3 || input.length()>=5) {
				System.out.println("4자리를 입력하세요.");
			}
			else if(password[0]==input.charAt(0) && password[1]==input.charAt(1) && password[2]==input.charAt(2) && password[3]==input.charAt(3)) {
			System.out.println("딩동댕! 어서 들어오세요 ^^");
			System.out.println("프로그램을 종료합니다.");
			break;
			}
			else {
				System.out.println("다시 입력하세요. 주인 맞나요?");
			}
		}
		scanner.close();
	}

}
