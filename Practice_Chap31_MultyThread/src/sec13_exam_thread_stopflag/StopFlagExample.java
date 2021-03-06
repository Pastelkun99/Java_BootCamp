package sec13_exam_thread_stopflag;

public class StopFlagExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		// 메인 스레드 1초 정지 후 PrintThread를 stop플래그로 정상종료 유도함.
		// 실제로 현업에서는 스레드를 중지할 때 스레드를 일시정지 상태로 만들어서
		// 종료하는 방법은 사용되지 않는다.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
	}
}
