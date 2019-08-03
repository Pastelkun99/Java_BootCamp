package sec01_verify;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 99);
		int input = 0;
		int count = 0;
		int min = 0;
		int max = 99;

		System.out.println("수를 결정하였습니다. 맞추어 보세요. : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			count++;
			System.out.print("");
			input = scanner.nextInt();

			if (input == answer) {
				System.out.println("정답입니다.");
				System.out.printf("시도횟수는 " + count + "번 입니다.");
				break;
			} else if (input > answer) {
				System.out.println("더 낮게");
				max = input;
				System.out.println(min + " >> " + input);
			} else if (input < answer) {
				System.out.println("더 높게");
				min = input;
				System.out.println(input + " >> " + max);

			}

		}

	}

}
