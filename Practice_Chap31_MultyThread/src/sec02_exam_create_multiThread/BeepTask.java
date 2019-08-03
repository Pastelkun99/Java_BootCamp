package sec02_exam_create_multiThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	//Runnable 인터페이스에 있는 run메소드를 오버라이딩함.
	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<5; i++) {
			System.out.println("BeepTask" + (i+1));
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
