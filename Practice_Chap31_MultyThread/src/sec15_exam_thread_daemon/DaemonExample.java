package sec15_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		// daemon���� ( ���� start() ȣ������ ������ �ؾ��Ѵ�.)
		autoSaveThread.setDaemon(true);
		
		autoSaveThread.start();
		
		if(autoSaveThread.isDaemon()) {
			System.out.println("autoSaveThread�� ���� �������Դϴ�.");
		}
		
		// ���� �����尡 5�ʵ��� �����ϸ�, daemon�������� autoSaveThread��
		// ����ǰ�, ���ν����尡 ����Ǹ� ���̻� autoSaveThread�� ������ �ȵǴ� ���� �� �� �ִ�.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("���� ������ �����");
	}
}
