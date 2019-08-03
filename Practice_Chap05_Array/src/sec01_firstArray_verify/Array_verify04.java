package sec01_firstArray_verify;

import java.util.Arrays;

public class Array_verify04 {

	public static void main(String[] args) {

		int[] score = new int[] { 79, 88, 91, 33, 100, 55, 95 };

		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score.length - 1; j++) {

				if (score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(score));
		System.out.println("최대값: " + score[score.length - 1]);
		System.out.println("최소값: " + score[0]);

	}
}
