package sec_verify10;

import java.util.Arrays;

public class MaxNumberExample {

	public static void main(String[] args) {
		
		int[] arr = {23, 72, 9, 54, 1747};
		
		MaxNumber mx = new MaxNumber();
		System.out.println("현재 배열 상태입니다.\n" + Arrays.toString(arr));
		mx.max(arr);
	
		int[] arr2 = new int[0];
		System.out.println("크기가 0인 배열의 주소를 줬을때 : " + mx.max(arr2));
		
		int[] arr3 = null;
		System.out.println("null값을 줬을 때 : " + mx.max(arr3));
	}

}
