package sec_verify05;

public class StopFlagExample {

	public static void main(String[] args) {
		
		ExecuteThread et = new ExecuteThread();
		et.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		
		et.setStop(true);
	}
}
