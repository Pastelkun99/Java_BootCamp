package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		
		System.out.print("1차원 배열의 방수를 입력 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()*100)+1;
			//System.out.println("arr[" + i + "] = " + arr[i]);
			System.out.print("arr[" + i + "] = ");
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println("입력하신 배열 값을 출력 합니다.");
		Arrays.sort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		System.out.print("어떤 값을 찾으십니까? >> ");
		Scanner scan2 = new Scanner(System.in);
		int inp = scan2.nextInt();
		
		
		Arrays.binarySearch(arr, inp);
		System.out.println(inp + "는 arr 배열의 " + (Arrays.binarySearch(arr, inp)+1) + "번째 방에 있습니다.");
		
		
		
	}
}
