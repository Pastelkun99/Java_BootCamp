package sec_verify00;

public class TestThread extends Thread {

	@Override
	public void run() {
		
		try {
			for(int i = 0; i<10; i++) {
			System.out.println(i + "��° Test �������� ���೻���Դϴ�.");
			Thread.sleep(500);
		}
		System.out.println("Test�����尡 ����˴ϴ�.");
			
		} catch (InterruptedException e) {}
	}
}