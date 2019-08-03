package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify01 {

	public static void main(String[] args) {
		
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.print("원소수 입력: ");
		count = scan.nextInt();
		
		int[] num = new int[count];
		
		scan.close();
	
		for(int i=0; i<count; i++) {
			num[i]=0;
			System.out.println("num[ "+ i +" ] = " + num[i]);	     	
		}
	}
}
