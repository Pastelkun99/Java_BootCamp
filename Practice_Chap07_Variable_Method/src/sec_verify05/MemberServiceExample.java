package sec_verify05;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService m = new MemberService();
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID �Է� : ");
		String id = scanner.nextLine();
		System.out.print("Password �Է� : ");
		String password = scanner.nextLine();
		m.login(id, password);
		
		m.logout(id);
		
		scanner.close();
		

	}

}
