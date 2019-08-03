package sec12.exam02_thread_wait_notify;

public class ProducerThread extends Thread {

	// 공유객체 Databox
	private DataBox dataBox;
	
	// 생성자
	public ProducerThread(DataBox dataBox) {
		this.setName("Producer Thread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=3; i++) {
			String data = "data" + i; 		// 데이터를 생산
			dataBox.setData(data);
		}
	}
}
