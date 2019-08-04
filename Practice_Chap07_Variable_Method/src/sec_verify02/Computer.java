package sec_verify02;

public class Computer {

	int sum(int[] values) { // <= 주소값을 가지고 있음
		
		int sum = 0;
		
		for (int i = 0; i < values.length; i++)
			sum += values[i]; // values[i]의 값을 지정
		return sum;

	}
}
