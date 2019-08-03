package sec01_firstArray_verify;

import java.util.Arrays;
import java.util.Scanner;

public class Array_verify03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿ø¼Ò ¼ö: ");
		int[] num = new int[scan.nextInt()];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num["+i+"] = ");
			int count = scan.nextInt();
			num[i] = count;
		}
		
		scan.close();
		System.out.println("num = " + Arrays.toString(num));	     	
		}
	}
