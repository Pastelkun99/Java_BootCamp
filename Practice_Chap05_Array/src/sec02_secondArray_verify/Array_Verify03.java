package sec02_secondArray_verify;

public class Array_Verify03 {

	public static void main(String[] args) {

		int[][] score = new int[][] { 
			{ 88, 95, 100},
			{ 85, 63, 20},
			{ 34, 30, 30},
			{ 40, 49, 70},
			{ 15, 75, 98}
			};

			int kortotal = 0;
			int engtotal = 0;
			int mathtotal = 0;

			int totalsum =0;

			System.out.println("번호\t국어\t영어\t수학\t총점\t평균 ");
			System.out.println("==================================================");

			for(int i=0; i<score.length; i++) {

				int sum = 0;
				double avg = 0.0;

				kortotal += score[i][0];
				engtotal += score[i][1];
				mathtotal += score[i][2];

				System.out.printf("%3d", i+1);

				for(int j = 0; j < score[i].length; j++) {
					sum += score[i][j];
					System.out.printf("\t%d", score[i][j]);
				}

				totalsum += sum;
				avg = sum/(double)score[i].length;
				System.out.printf("\t%d \t%.1f%n", sum, avg);
			}
			System.out.println("==================================================");
			System.out.printf("총점 -> [국어] %d [영어] %d [수학] %d [전체] %d", kortotal, engtotal, mathtotal, totalsum);
		}	

	}