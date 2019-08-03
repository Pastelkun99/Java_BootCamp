package sec_verify01;

public class RecordingRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i<3; i++) {
				System.out.println("녹화를 시작합니다.");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
	}

}
