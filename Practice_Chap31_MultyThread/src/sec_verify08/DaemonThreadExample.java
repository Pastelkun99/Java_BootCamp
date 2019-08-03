package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread dt = new DateTimeThread();
		dt.setDaemon(true);
		dt.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("데몬 스레드인 dateTimeThread가 종료됩니다.");
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드가 종료됩니다.");
	}
}
