package sec_verify02;

public class YourThreadRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(200);
			for(int i = 0; i<5; i++) {			
			System.out.println("Your Thread");
			}
		} catch (InterruptedException e) {}
	}

}
