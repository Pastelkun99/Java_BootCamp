package sec13_exam_thread_stopflag;

public class PrintThread extends Thread {

	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		// �ܺο��� stop�� true�� �����ϸ� �������� ���´�.
		while(!stop) {
			System.out.println("������");
		}
		System.out.println("�ý��� �ڿ� �����Ϸ�");
		System.out.println("���� ����");
	}
}
