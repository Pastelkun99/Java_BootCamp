package sec02_secondArray_verify;

public class Array_Verify02 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		
		int[][] score = new int[][] { 
			{ 100, 100, 100},
			{ 20, 20, 20},
			{ 30, 30, 30},
			{ 40, 40, 40},
			{ 50, 50, 50}
			};
			
		int[][] result = new int[][] { 
			{ 100, 100, 100},
			{ 20, 20, 20},
			{ 30, 30, 30},
			{ 40, 40, 40},
			{ 50, 50, 50}
			};
			
			int total1 = 0;
			int total2 = 0;
			int total3 = 0;

			int totalsum =0;

			for(int i=0; i<result.length; i++) {

				int sum = 0;
			
				total1 += result[i][0];
				total2 += result[i][1];
				total3 += result[i][2];

				for(int j = 0; j < result[i].length; j++) {
					sum += result[i][j];
					System.out.printf("%4d", result[i][j]);
					}
				
				totalsum += sum;
				System.out.printf("%4d%n", sum);
				}
			
			System.out.printf("%4d %3d %3d %3d", total1, total2, total3, totalsum);
			
		}

	}