package sec01_verify;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {

		System.out.println("M, m 오전, A, a 오후, E, e 저녁");
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String sel = scanner.nextLine();
		scanner.close();

		switch (sel) {
		case "M":
		case "m":
			System.out.println("오전이네~");
			break;
		case "A":
		case "a":
			System.out.println("오후네~");
			break;
		case "E":
		case "e":
			System.out.println("저녁이네~");
			break;
		default:
			System.out.println("잘못 입력했네~");
		}

	}

}
