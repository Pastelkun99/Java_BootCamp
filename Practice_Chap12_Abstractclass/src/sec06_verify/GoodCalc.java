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
		System.out.print("��� ���� ������? : ");
		int room = scanner.nextInt();
		int[] arr = new int[room];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "��° �� : ");
			int input = scanner.nextInt();
			arr[i] = input;
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		System.out.print("�迭 " + Arrays.toString(arr) + " �� ��� : ");
		scanner.close();
		return avg;
	}
}
