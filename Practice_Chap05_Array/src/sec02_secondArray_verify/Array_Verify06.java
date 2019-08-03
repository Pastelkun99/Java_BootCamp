package sec02_secondArray_verify;

public class Array_Verify06 {

	public static void main(String[] args) {
		
		int[][] array = { 
				{95, 86, 100, 55},
				{83, 92, 96},
				{78, 83, 93, 87, 88, 77, 10}
				};	
		
		int a = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int totalsum;
		
		for(int i=0; i < array[0].length; i++) {
			sum1 += array[0][i];
			a++;
		}
		for(int i=0; i < array[1].length; i++) {
			sum2 += array[1][i];
			a++;
		}
		for(int i=0; i < array[2].length; i++) {
			sum3 += array[2][i];
			a++;
		}
		
		totalsum = sum1 + sum2 + sum3;
		float avg = (float)totalsum / a;
		System.out.printf("위 가변 배열의 합계(sum) : %d\n", totalsum);
		System.out.printf("위 가변 배열의 평균(avg) : %.1f", avg);
	}

}
