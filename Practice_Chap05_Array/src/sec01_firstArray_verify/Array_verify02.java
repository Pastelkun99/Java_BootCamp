package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify02 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("���Ҽ� �Է�: ");
		num = scan.nextInt();
		
		System.out.println("������ ���ԵȰ��� ����մϴ�.");
		int[] arr = new int[num];
		scan.close();
	
		for(int i=0; i<num; i++) {
			arr[i]= ((int)(Math.random()*10)+1);
			System.out.println("arr[ "+ i +" ] = " + arr[i]);	     	
		}
	}
}
