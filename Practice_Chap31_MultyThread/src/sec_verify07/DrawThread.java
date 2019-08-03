package sec_verify07;

public class DrawThread extends Thread {

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("그림 그리는 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted 호출됨");
			System.out.println("스레드 자원 정리");
			System.out.println("스레드 종료");
		}
	}
}
