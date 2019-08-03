package sec_verify07;

public class InterruptExample {

	public static void main(String[] args) {
		
		DrawThread dt = new DrawThread();
		dt.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		
		dt.interrupt();
	}
}
