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
			System.out.print((i+1) + "번째 국어점수 입력 : ");
			score[i][j] = scanner.nextInt();
			korsum += score[i][j];
		
			System.out.print((i+1) + "번째 수학점수 입력 : ");
			score[i][j+1] = scanner.nextInt();
			mathsum += score[i][j+1];

			studentsum[i] = score[i][j]/*i번학생의 국어성적*/ + score[i][j+1];/*i번학생의 수학성적*/
			}
		
		System.out.println("===================================================");
		System.out.printf("국어 평균 : %.2f\n", (double)korsum/score.length);
		System.out.printf("수학 평균 : %.2f\n", (double)mathsum/score.length);
		System.out.println("===================================================");
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf((i+1) + "번째 학생의 평균 = %.1f\n", (double)studentsum[i]/2);
		}
		scanner.close();
	}

}
