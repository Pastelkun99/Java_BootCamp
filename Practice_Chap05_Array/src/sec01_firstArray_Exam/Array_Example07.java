package sec01_firstArray_Exam;

public class Array_Example07 {

	public static void main(String[] args) {

		int[] ball = new int[5];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = (int) (Math.random() * 10);
		}

		System.out.println("���� ��");

		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}

		// arrays.sort[ball]; <-- �Ʒ� ���� �����̶� ���� ��.
		// ���� ������ �ϱ� ���ؼ��� ������� + ���ǹ� �ʼ��Դϴ�. ���� �ʵ��� �սô�.
		// ���� ������ �ñ��Ͻôٸ� ���ۿ��� ���� ������ �˻��մϴ�!

		for (int i = 0; i < ball.length; i++) {

			for (int j = 0; j < ball.length - 1; j++) { // �� -1 �� �ٿ������.
				// ���� ����(����)
				if (ball[j] > ball[j + 1]) {
					int temp = ball[j]; // �� ���� �ٲٱ� ���� temp ����.
					ball[j] = ball[j + 1];
					ball[j + 1] = temp;
				}
			}
		}

		System.out.println("���� ��");

		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}
	}

}
