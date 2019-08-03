package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_verify06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿ø¼Ò ¼ö : ");
		int num = scanner.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 8 + 1);
			System.out.print("a[" + i + "] : ");
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();

	}

}