package sec08_exam_thread_state;

// stateprintthread는 targetthread의 상태를 알기 위한 스레드이다.
public class StatePrintThread extends Thread {

	// 스레드 상태를 알아보기 위해 멤버로 targetthread를 선언하였다.
	private TargetThread targetThread;
	
	//생성자
	public StatePrintThread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		
		while(true) {
			//Targetthread의 상태정보를 얻는다.
			// Thread.state는 Thread클래스의 내부클래스이며, Enum타입이다.
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : " + state);
			//targetthread가 생성되었나? 되었으면 run() 실행
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			//스레드가 종료되었나?
			if(state == Thread.State.TERMINATED) {
				break;
				//종료되었다면 루프 탈출
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
