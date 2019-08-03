package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		int total = 0;
		String input;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("상품금액 입력 : ");
			input = scanner.next();
			if (input.equals("끝")) {
				System.out.println("구매하신 상품들의 총 가격은 " + total + "입니다.");
				break;
			} else {
				total += Integer.parseInt(input);
			}
		}

		scanner.close();

	}

}
