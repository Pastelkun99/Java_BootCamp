package sec_verify07;

public class DrawThread extends Thread {

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("�׸� �׸��� ��");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted ȣ���");
			System.out.println("������ �ڿ� ����");
			System.out.println("������ ����");
		}
	}
}
