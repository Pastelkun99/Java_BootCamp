package sec01_firstArray_verify;

import java.util.Scanner;

public class Array_Verify12 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");

			int select = scanner.nextInt();

			if (select == 1) {
				System.out.print("학생 수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (select == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			}

			else if (select == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}

			else if (select == 4) {
				int max = 0;
				int sum = 0;
				double avarage = 0;

				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i] ? scores[i] : max);
					sum += scores[i];
				}
				avarage = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avarage);
			}

			else if (select == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
