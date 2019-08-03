package sec02_secondArray_verify;

import java.util.Scanner;

public class Array_Verify05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int classnum = 0; // �ݼ�
		int sumtotal = 0;
		float avgtotal = 0.0f;

		System.out.printf("�ݼ� : ");
		classnum = scan.nextInt(); // �ݼ� �Է�
		int[][] score = new int[classnum][];

		for (int i = 1; i <= classnum; i++) {
			System.out.printf(i + "���� �ο� : ");
			score[i - 1] = new int[scan.nextInt()];

			for (int j = 1; j <= score[i - 1].length; j++) {
				System.out.printf(i + "�� " + j + "���� ���� : ");
				score[i - 1][j - 1] = scan.nextInt();
			}

			System.out.println();

		}
		System.out.println("��\t�հ�\t���");
		System.out.println("---------------------");

		for (int k = 0; k < score.length; k++) {
			int sum = 0; // �ݺ� �հ�
			float avg = 0; // �����

			for (int l = 0; l < score[k].length; l++) {
				sum += score[k][l];
			}

			sumtotal += sum;
			avg = (float) sum / score[k].length;
			avgtotal += (float) avg / classnum;
			System.out.printf("%d��\t%d\t%.1f\n", k + 1, sum, avg);
		}

		System.out.println("---------------------");
		System.out.printf("��\t%d\t%.1f", sumtotal, avgtotal);
		scan.close();

	}
}