package sec01_firstArray_verify;

public class Array_verify05 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		System.out.println("원래의 배열 값들을 출력");

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			if (i == 9) {
				System.out.println(numArr[i]);
			} else {
				System.out.print(numArr[i] + ",");
			}
		}

		System.out.println();

		System.out.println("값을 임의로 섞은 후 출력");

		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}

		for (int i = 0; i < numArr.length; i++) {
			if (i == 9) {
				System.out.print(numArr[i]);
			} else {
				System.out.print(numArr[i] + ",");
			}
		}
	}
}
