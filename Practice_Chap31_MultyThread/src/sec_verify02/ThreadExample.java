package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread1 = new MyThread();
		thread1.start();
		
		Runnable your = new YourThreadRunnable();
		Thread thread2 = new Thread(your);
		thread2.start();
		
		/*Thread thread3 = new Thread() {
		@Override
		public void run() {
			try {
				for(int i = 0; i<4; i++) {
				System.out.println("Someone's Thread");
				Thread.sleep(300);
			}
			} catch (InterruptedException e) {}
		}
	};

	thread3.start();*/
	}
}
