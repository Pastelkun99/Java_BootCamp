package sec_verify04;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
			
		  Scanner scan = new Scanner(System.in);

		  System.out.println("제곱까지의 합을 계산합니다.");
		  System.out.println("ex) 2의 3승 : 2의1승 + 2의2승 + 2의3승은 14입니당.");
		  System.out.print("제곱하고 싶은 수를 입력 : ");
		  int x=scan.nextInt();
		  System.out.print("몇승을 더할까요? : ");
		  int n=scan.nextInt();
	
		  System.out.println(x + "의 " + n + "승 까지의 합 = " + Power.power(x, n));
		  scan.close();

	}

}
