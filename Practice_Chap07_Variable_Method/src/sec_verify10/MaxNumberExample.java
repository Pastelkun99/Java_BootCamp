package sec_verify10;

import java.util.Arrays;

public class MaxNumberExample {

	public static void main(String[] args) {
		
		int[] arr = {23, 72, 9, 54, 1747};
		
		MaxNumber mx = new MaxNumber();
		System.out.println("���� �迭 �����Դϴ�.\n" + Arrays.toString(arr));
		mx.max(arr);
	
		int[] arr2 = new int[0];
		System.out.println("ũ�Ⱑ 0�� �迭�� �ּҸ� ������ : " + mx.max(arr2));
		
		int[] arr3 = null;
		System.out.println("null���� ���� �� : " + mx.max(arr3));
	}

}
