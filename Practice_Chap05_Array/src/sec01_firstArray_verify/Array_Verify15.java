package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify15 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int in = 0;
		int count = 0;
		int[] array = new int[100];

		System.out.println("원하는 정수를 계속 입력하세요 ( -1을 입력하면 빠져나갑니다.)");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		in = scanner.nextInt();

		for (int i = 0; i < 100; i++) {
			@SuppressWarnings("resource")
			Scanner scanner2 = new Scanner(System.in);
			array[i] = scanner2.nextInt();

			if (array[i] == -1) {
				break;
			} else {
				count++;
			}
		}
		if (count < 3) {
			System.out.println("마지막 3개의 값은 ");
			for (int i = 0; i < count; i++) {
				System.out.println(array[i]);
			}
			System.out.println("이네요.");
		} else {
			System.out.println("마지막 3개의 값은");
			for (int i = count - 3; i < count; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("이네요.");
		}

	}

}
