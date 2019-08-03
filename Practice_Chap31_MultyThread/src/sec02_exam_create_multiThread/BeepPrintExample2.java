package sec02_exam_create_multiThread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		// ���� �����ϴ� ��Ƽ������� �ϴ� 3���� ���
		// ���1 --> ���� ����
		Runnable beepTask = new BeepTask(); 	//�������̽��� ������
		Thread thread = new Thread(beepTask);
		
		// ���2 --> �͸� ���� Ŭ���� �̿�
		/*Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//�������� 5�� �Ҹ����� ��.
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		});*/
		
		// ��� 3 --> ���ٽ�(�Լ��� �������̽�) �̿��Ͽ� �ʰ���ȭ ()�� run�޼����� �Ű������� 
		// �ǹ��ϴµ� �Ű������� 1���� ���ٴ� ���� �ǹ��Ѵ�. run()�� ������� �ǹ���.
		// ���ٽ��� 1.8���� �����ߴµ� ���߿� ���� �ȴ�.
		/*Thread thread = new Thread( ()-> {
			//������ 5�� �Ҹ����� ��.
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
		}
	});*/
		//Thread thread = new Thread(new BeepTask()); -> �����带 �� �����ϰ������ �ٽ� �����ض�.
		thread.start();			// run()�� main�����尡 �����϶�� ������. �̶����� main�������
								// beepTask�����尡 ���ÿ� �����. beep�� 5�� ����
		
		//�Ʒ��� ���ν����尡 ������ �κ�
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}
