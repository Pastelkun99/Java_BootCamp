package sec12.exam02_thread_wait_notify;

public class ProducerThread extends Thread {

	// ������ü Databox
	private DataBox dataBox;
	
	// ������
	public ProducerThread(DataBox dataBox) {
		this.setName("Producer Thread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=3; i++) {
			String data = "data" + i; 		// �����͸� ����
			dataBox.setData(data);
		}
	}
}
