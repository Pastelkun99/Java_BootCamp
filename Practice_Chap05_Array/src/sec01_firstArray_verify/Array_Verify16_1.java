package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify16_1 {

	public static void main(String[] args) {
		
		String input;
		Scanner scanner = new Scanner(System.in);
		char[] password = new char[] {'c', 'o', 'd', 'e'};
		
		while(true) {
			System.out.println("��ȣ 4�ڸ� �Է� : ");
			input = scanner.nextLine();
			if(input.length()<=3 || input.length()>=5) {
				System.out.println("4�ڸ��� �Է��ϼ���.");
			}
			else if(password[0]==input.charAt(0) && password[1]==input.charAt(1) && password[2]==input.charAt(2) && password[3]==input.charAt(3)) {
			System.out.println("������! � �������� ^^");
			System.out.println("���α׷��� �����մϴ�.");
			break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���. ���� �³���?");
			}
		}
		scanner.close();
	}

}
