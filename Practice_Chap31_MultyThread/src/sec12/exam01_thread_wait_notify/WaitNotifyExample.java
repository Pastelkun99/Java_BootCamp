package sec12.exam01_thread_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		// ���� �ڵ忡 ���� notify()�� wait()�� ȣ���ϰ� ����ȭ�޼���� �Ǿ� �־�
		// ������ ����Ǵ� ���� �� �� �ִ�.
		
		threadA.start();
		threadB.start();
		
		// �ٽ� �� �� ����������, wait(), notify(), notifyall()�� ObjectŬ������
		// �޼����̸�, ���� ����ȭ(Synchronized)�޼���� ����ȭ �������� ��밡���ϴٴ�
		// ���� ���� ���� �ʵ��� ����.
	}
}
