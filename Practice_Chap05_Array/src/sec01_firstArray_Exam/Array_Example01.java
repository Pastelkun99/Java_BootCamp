package sec01_firstArray_Exam;

public class Array_Example01 {

	public static void main(String[] args) {

		// int�� �迭�� score(��������)�� int[5] = 20����Ʈ ������, �ּҰ��� �Ѱ��ݴϴ�.
		int[] score = new int[10]; 
		// 10���� �濡 0 (�⺻��)�� �ڵ� �ʱ�ȭ ���� �Է��մϴ�.
		int k = 1;
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70
		score[3] = 80;
		score[4] = 90;

		// score : int[] �ּҰ��� ����
		// score[i] : �ε����� �ִ� �������� �ǹ�

		// int tmp = score[3] + score[4]
		int tmp = score[k + 2] + score[4];

		// for������ �迭�� ��� ��Ҹ� ����� �� �ֽ��ϴ�.
		// System.out.println() �޼ҵ带 �迭�� ���� ����ŭ �ݺ��ϴ� �ͺ��� �����ϴ�.
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}

		System.out.println("tmp: " + tmp);
		System.out.println("score[7] : " + score[7]);
		System.out.println(score); // �ּҰ��� ��� (��°� �Ǿտ� [ �� ������ �迭Ÿ���̶�� ����.)

	}

}