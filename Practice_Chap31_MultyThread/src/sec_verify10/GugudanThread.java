package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {

	@Override
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 수를 입력하세요 >> ");
		int num = scan.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		scan.close();
	}

}
