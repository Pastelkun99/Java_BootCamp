package sec02_secondArray_verify;

import java.util.Scanner;

public class Array_Verify04 {

	public static void main(String[] args) {
		
		int[][] score = new int[6][2];
		int[] studentsum = new int[6];
		
		int korsum = 0;
		int mathsum = 0;

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0, j=0; i<score.length; i++) {
			System.out.print((i+1) + "��° �������� �Է� : ");
			score[i][j] = scanner.nextInt();
			korsum += score[i][j];
		
			System.out.print((i+1) + "��° �������� �Է� : ");
			score[i][j+1] = scanner.nextInt();
			mathsum += score[i][j+1];

			studentsum[i] = score[i][j]/*i���л��� �����*/ + score[i][j+1];/*i���л��� ���м���*/
			}
		
		System.out.println("===================================================");
		System.out.printf("���� ��� : %.2f\n", (double)korsum/score.length);
		System.out.printf("���� ��� : %.2f\n", (double)mathsum/score.length);
		System.out.println("===================================================");
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf((i+1) + "��° �л��� ��� = %.1f\n", (double)studentsum[i]/2);
		}
		scanner.close();
	}

}
