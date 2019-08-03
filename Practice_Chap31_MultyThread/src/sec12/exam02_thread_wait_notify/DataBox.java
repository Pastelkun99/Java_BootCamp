package sec12.exam02_thread_wait_notify;

public class DataBox {

	private String data;
	
	// �Ʒ� getdata()�� Consumerthread�� data�� �о���� �Ǿ� �ִ�.
	// �׷��� null�̸� wait(�Ͻ����� : Block����) �ϰ�, null�� �ƴ϶��
	// ConsumerThread�� ���� �����͸� ����ϸ鼭, �ٸ� waiting�� �����带
	// notify�� ���ؼ� ��������·� �ٲ۴�.
	
	public synchronized String getData() {
		// �о�� �����Ͱ� ���ٸ�...
		if(this.data == null) {
			try {
				wait(); 		// �Ͻ� ���� ���·� ����.
			} catch (InterruptedException e) {}
		}
		
		String returnValue = this.data;
		System.out.println("Consumer Thread�� ���� ������ : " + returnValue);
		this.data = null;
		
		// �ٸ� ������ (������ ������) �� �ƿ��. (��, ��������� Runnable�� �����.)
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		// consumerthread�� �����͸� ���� �ʾҴٸ�...
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data; 	//�ʵ忡 ���� �����ϰ�
		System.out.println("Producer Thread�� ������ ������ : " + this.data);
		notify(); 	// �ٸ� ������ (�����ӽ�����) �� �����.
	}
	
	// ����������� wait()�� notify()�� �̿��Ͽ� ������ ���鼭 ������
	// �� ������ü�� �����ϱ� ���ؼ��� synchronized�� ����ȭ Ű���尡 
	// ���� ���� ���ܵ� �߻����� �ʰ�, �������� ��Ȯ���� ���� �Ѵ�.
	// ��, �ٽø��� ��ü ����� �Ͼ�� �Ѵٴ� ���̴�.
}
