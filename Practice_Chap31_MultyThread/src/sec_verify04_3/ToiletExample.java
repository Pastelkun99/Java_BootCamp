package sec_verify04_3;

public class ToiletExample {

	
	public static void main(String[] args) {	
		
		Toilet ddong = new Toilet();
		
		ToiletUsingThread t1 = new ToiletUsingThread(ddong, "아버지");
		ToiletUsingThread t2 = new ToiletUsingThread(ddong, "딸");
		ToiletUsingThread t3 = new ToiletUsingThread(ddong, "아들");
		ToiletUsingThread t4 = new ToiletUsingThread(ddong, "어머니");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
