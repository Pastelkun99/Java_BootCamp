package sec01_verify;

public class Exercise12_01 {

	public static void main(String[] args) {

		for (int line = 1; line < 8; line++) {
			for (int star = line; star < 8; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}