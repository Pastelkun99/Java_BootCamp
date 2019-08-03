package sec_verify01;

import java.util.Scanner;

public class MyExpPromote {
	
	
	public static void main(String[] args) {
		
		int base;
		int exp;
		int result = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¹Ø : ");
		base = scan.nextInt();
		System.out.print("Áö¼ö : ");
		exp = scan.nextInt();
		
		for(int i=1; i<=exp; i++) {
			result = result*base;
		}
		
		System.out.println(base + "ÀÇ " + exp + "½Â °á°ú : " + result);
		scan.close();
		
	}
	
}
