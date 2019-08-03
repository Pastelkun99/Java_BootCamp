package sec_verify03;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread1 = new NumberThread();
		thread1.start();
		Thread thread2 = new BombThread();
		thread2.start();
		
	}
}
