package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify10 {

	public static void main(String[] args) {
		
		System.out.print("���Ҽ� �Է� : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for(int i= 0; i<n/2; i++) {
			int tmp = a[i];
			a[i] = a[n-i-1]; // ��Ҽ��� 8�� ��� 0>7, 1>6, 2>5, 3>4 / 7�ΰ�� 0>6 1>5 2>4 3
			a[n-i-1] = tmp;
			
		}
		
		System.out.println("");
		System.out.println("�迭�� ���Ҹ� �ݴ�� �ٲپ����ϴ�.");
		
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		scanner.close();
	}

}
