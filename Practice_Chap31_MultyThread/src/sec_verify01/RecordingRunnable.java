package sec_verify01;

public class RecordingRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i<3; i++) {
				System.out.println("��ȭ�� �����մϴ�.");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
	}

}
