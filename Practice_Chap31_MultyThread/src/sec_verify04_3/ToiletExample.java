package sec_verify04_3;

public class ToiletExample {

	
	public static void main(String[] args) {	
		
		Toilet ddong = new Toilet();
		
		ToiletUsingThread t1 = new ToiletUsingThread(ddong, "�ƹ���");
		ToiletUsingThread t2 = new ToiletUsingThread(ddong, "��");
		ToiletUsingThread t3 = new ToiletUsingThread(ddong, "�Ƶ�");
		ToiletUsingThread t4 = new ToiletUsingThread(ddong, "��Ӵ�");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
