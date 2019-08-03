package sec01_verify;

public class Exercise15 {

	public static void main(String[] args) {

		int var1 = 2;
		int var2 = 0;
		int var3 = 1;

		while (true) {
			if (var2 == 0) {
				for (int j = 1; j <= var1; j++) {
					System.out.print(" ");
				}
				System.out.println(var3 * var3);
				var3 = var3 * 10 + 1;
				var1--;
				if (var1 == 0) {
					var2 = 1;
				}
			} else if (var2 == 1) {
				for (int j = 1; j <= var1; j++) {
					System.out.print(" ");
				}
				System.out.println(var3 * var3);
				var3 = var3 / 10;
				var1++;
				if (var1 > 2) {
					break;
				}
			}
		}
	}
}
