package sec01_firstArray_Exam;

public class Array_Example02 {

	public static void main(String[] args) {

		// int�� �迭�� score(��������)�� int[5] = 20����Ʈ ������, �ּҰ��� �Ѱ��ݴϴ�.

		int sum = 0; // ������ �����ϱ� ���� ����
		float average = 0.0f; // float ������ f�� ���� ���� ������ �Է½� ������ ������ �߻��մϴ�.

		// ����� ���ÿ� �ʱ�ȭ�� �� �ֽ��ϴ�.
		int[] score = new int[] { 100, 88, 100, 100, 90 };

		System.out.println("�迭�� ���� : " + score.length);

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // �迭�� ����
		}

		// ������� float�� ��� �����Դϴ�.
		average = sum / (float) score.length;

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}
