package sec_verify02;

import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� �̸��� �Է� �Ͻǰǰ���? >> ");
		int input = scan.nextInt();
		
		LongStringSearch lcs1 = new LongStringSearch(input);
		
		for(int i = 0; i<input; i++) {
			System.out.print((i+1) + "��° �̸��� �Է��ϼ��� >> ");
			Scanner scan2 = new Scanner(System.in);
			String str = scan2.nextLine();
			lcs1.addString(str);
		}
		System.out.println();
		
		lcs1.listPrint();
		
		lcs1.longestString();
		
		
		
	}
}
