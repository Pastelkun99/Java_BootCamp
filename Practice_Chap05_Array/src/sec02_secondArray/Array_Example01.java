package sec02_secondArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		//2���� �迭 ����� ���ÿ� �ʱ�ȭ�� �ϰ� �ֽ��ϴ�.
		int[][] score = new int[][] {
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40}
		};
		int sum=0;
		System.out.println("2���� �迭�� �ּ� ��:"+score);
		
		//2���� �迭�� �����ϱ� ���� �ߺ� for���� ����ϰ� �ֽ��ϴ�.
		for(int i=0; i<score.length; i++) {
			System.out.println("1���� �迭�� �ּҰ�:"+score[i]);
			for(int j=0; j<score[i].length; j++) {
				System.out.println("score["+i+"]"+"["+j+"]="+score[i][j]);
			}
					
		}
		
		//���� for��(JDK 1.5�������� ������.
		//�Ŀ� �÷��������ӿ� �κп��� ��ü�� ������ �� �Ʒ��� ���� ���� for���� ����մϴ�.)
		
		//������ Ÿ�� ���� : ������ ���
		for(int[] tmp:score) {
			for(int i : tmp) {
				sum+=i;
			}
		}
		System.out.println("sum="+sum);
	}

}
