package sec01_firstArray_verify;

import java.util.Arrays;

public class Array_Verify13 {

	public static void main(String[] args) {
		int max_num = 0;
		int[] arr = new int[10];

		System.out.println("������"); // ���� ���� ����, ���� ���ڴ� ���� index�� count
		for (int i = 0; i <= 100; i++) {
			int ran_num = (int) (Math.random() * 10);
			System.out.print(ran_num + " ");
			arr[ran_num]++; // 0~9���� ����� �濡 ī��Ʈ ++����
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) { // ���� ū ���ڸ� ��� ��.
			if (arr[max_num] <= arr[i]) {
				max_num = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("���� ���� ������ ���� : " + max_num + ", " + arr[max_num] + "��");
	}

}
