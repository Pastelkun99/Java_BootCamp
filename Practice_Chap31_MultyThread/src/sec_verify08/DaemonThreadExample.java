package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread dt = new DateTimeThread();
		dt.setDaemon(true);
		dt.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("���� �������� dateTimeThread�� ����˴ϴ�.");
		} catch (InterruptedException e) {}
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}
