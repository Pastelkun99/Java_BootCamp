package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		
		System.out.print("1���� �迭�� ����� �Է� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()*100)+1;
			//System.out.println("arr[" + i + "] = " + arr[i]);
			System.out.print("arr[" + i + "] = ");
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println("�Է��Ͻ� �迭 ���� ��� �մϴ�.");
		Arrays.sort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		System.out.print("� ���� ã���ʴϱ�? >> ");
		Scanner scan2 = new Scanner(System.in);
		int inp = scan2.nextInt();
		
		
		Arrays.binarySearch(arr, inp);
		System.out.println(inp + "�� arr �迭�� " + (Arrays.binarySearch(arr, inp)+1) + "��° �濡 �ֽ��ϴ�.");
		
		
		
	}
}
