package sec06_verify;

import java.util.Arrays;
import java.util.Scanner;

public class GoodCalc extends Calculator {

	@Override
	public int add(int x, int y) {
		int result = 0;
		x = 2;
		y = 3;
		result = x+y;
		return result;
	}
	
	@Override
	public int subtract(int x, int y) {
		int result = 0;
		x = 2;
		y = -13;
		result = x-y;
		return result;
	}
	
	public double average() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 방을 만들까요? : ");
		int room = scanner.nextInt();
		int[] arr = new int[room];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 값 : ");
			int input = scanner.nextInt();
			arr[i] = input;
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		System.out.print("배열 " + Arrays.toString(arr) + " 의 평균 : ");
		scanner.close();
		return avg;
	}
}
