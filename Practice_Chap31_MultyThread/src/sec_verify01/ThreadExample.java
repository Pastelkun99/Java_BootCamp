package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {
				
		Runnable record = new RecordingRunnable();
		Thread thread2 = new Thread(record);
		thread2.start();
		
		Thread thread = new MovieThread();
		thread.start();
		/*Thread thread3 = new Thread() {
			@Override
			public void run() {
				try {
					for(int i = 0; i<4; i++) {
					System.out.println("¹» ÇÏÁÒ?");
					Thread.sleep(300);
				}
				} catch (InterruptedException e) {}
			}
		};

		thread3.start();*/
	}
}
