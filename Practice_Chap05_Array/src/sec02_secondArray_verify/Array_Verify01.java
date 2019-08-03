package sec02_secondArray_verify;

import java.util.Scanner;

public class Array_Verify01 {

	public static void main(String[] args) {

		int input;

		Scanner scanner = new Scanner(System.in);

		System.out.print("input : ");
		input = scanner.nextInt();

		String[][] arr = new String[input][input];

		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				arr[i - 1][j] = "*";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int randomposition = (int) (Math.random() * arr.length);
			String[] tmp = arr[randomposition];
			arr[randomposition] = arr[i];
			arr[i] = tmp;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (arr[j][i] == null)
					System.out.printf("\t");
				else
					System.out.printf("\t%s", arr[j][i]);
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("\t%d", i);
		}

		scanner.close();

	}
}
