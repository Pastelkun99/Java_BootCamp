package sec01_verify;

public class Exercise12 {

	public static void main(String[] args) {

		for (int line = 1, emp = 0; line < 6; line++) {

			for (int starnblank = 0; starnblank < emp + 3; starnblank++) {
				System.out.print((starnblank < (2 - emp)) ? " " : "*");
			}
			if (line < 3) {
				emp++;
			} else {
				emp--;
			}
			System.out.println();
		}

	}

}