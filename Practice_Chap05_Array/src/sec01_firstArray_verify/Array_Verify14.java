package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify14 {

	public static void main(String[] args) {

		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month = scanner.nextInt();

		System.out.println(+day[month - 1] + "일");
		scanner.close();

	}

}
