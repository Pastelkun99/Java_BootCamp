package sec02_exam;

public class TvTestExample03 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		int i = 0;
		
		//Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		
		for(i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv(); // attach �ϴ� �۾�
			tvArr[i].channel = i+10; //tvArr[i]�� channel�� i+10�� ����
			System.out.println(tvArr[i].channel); //���
		}

		for(i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]�� �޼��带 ȣ��. ä���� 1����
			System.out.printf("tvArr[%d].channel=%2d %n", i, tvArr[i].channel);
		}
		System.out.println();
		
		//���� for��
		//������ Ÿ�� : ������ ���
		for(Tv tv : tvArr) {
			tv = new Tv();
			tv.channel = 10; //tvArr ���ο� Tv�ν��Ͻ��� ����� channel1�� 10�� ����
			System.out.println(tv.channel);
		} 
	}

}
