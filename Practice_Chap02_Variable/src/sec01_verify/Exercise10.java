package sec01_verify;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input 입력 : ");
		String input = scanner.nextLine(); 
		scanner.close();
		
		System.out.println("입력한 문자열은 " + input + "입니다.");

	}

}
