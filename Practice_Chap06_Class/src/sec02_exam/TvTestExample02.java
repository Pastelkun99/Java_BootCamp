package sec02_exam;

public class TvTestExample02 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv(); //new ��� �����ڰ� ���� �ƹ� ���� ���� �����ٰ� Ŭ������ ũ�� ��ŭ �޸𸮸� �Ҵ��Ѵ�.
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�.");
		
		/*System.out.println("t1�� �ּ� : " + t1.toString());
		  System.out.println("t2�� �ּ� : " + t2.toString());
		 */

		t2 = t1; //t2�� �ּҰ� ������ (�� ���� �ν��Ͻ��� ����Ű�� �ִ�.)
		
		/*System.out.println("t1�� �ּ� : " + t1.toString());
		  System.out.println("t2�� �ּ� : " + t2.toString());
		 */
		
		//channel ���� 7�� �Ѵ�.
		t2.channel = 7;
		
		System.out.println("t1�� channel ���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�.");
	}

}
