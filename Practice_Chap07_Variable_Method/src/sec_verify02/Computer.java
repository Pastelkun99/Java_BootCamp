package sec_verify02;

public class Computer {

	int sum(int[] values) { // <= �ּҰ��� ������ ����
		
		int sum = 0;
		
		for (int i = 0; i < values.length; i++)
			sum += values[i]; // values[i]�� ���� ����
		return sum;

	}
}
