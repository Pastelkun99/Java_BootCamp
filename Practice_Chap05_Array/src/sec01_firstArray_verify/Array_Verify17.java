package sec01_firstArray_verify;

public class Array_Verify17 {

	public static void main(String[] args) {

		double[] array = new double[] { 1.1, 2.2, 6.6, 4.4, 5.5, 4.4, 3.3, 4.4, 2.2, 3.3 };

		int i;
		int j;
		int duplicate;

		for (i = 0; i < 10; i++) {
			duplicate = 0;

			for (j = i - 1; j >= 0; j--) {
				if (array[i] == array[j]) {
					duplicate = 1;
					break;
				}
			}
			if (duplicate == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
