package sec01_firstArray_verify;

import java.util.Arrays;

public class Array_verify08 {

	public static void main(String[] args) {

		int[] code = new int[] { -9, -55, 73, 116, 101, 205, 1000 };
		int[] array = new int[10];

		System.out.println("��µǴ� ���� code�迭�� �ִ� �����θ� ������.");
		System.out.println("arr�迭 �� ���");

		for (int i = 0; i < array.length; i++) {
			int n = (int) (Math.random() * 7);
			array[i] = code[n];
		}
		System.out.println(Arrays.toString(array));
	}

}
