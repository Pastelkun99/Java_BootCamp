package sec01_firstArray_verify;

public class Array_verify07 {

	public static void main(String[] args) {

		int[] ball = new int[20];
		System.out.println("0 ~ 19�� ������� �� ���");

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
			System.out.println("ball[" + i + "] = " + ball[i]);
		}

		System.out.println();
		System.out.println("ball�迭�� �տ������� 6���� ���(���� ���� ��, �������� ������ ���)");

		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball.length - 1; j++) {
				if (ball[j] < ball[j + 1]) {
					int temp = ball[j];
					ball[j] = ball[j + 1];
					ball[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "] = " + ball[i]);
		}
	}

}
