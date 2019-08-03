package sec10_exam_thread_yield;

public class ThreadB extends Thread {

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		//무한루프를 돌고있다.
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {}
				System.out.println("ThreadB 작업 내용");
			}
			else {
				//무의미한 반복을 막기위해 다른 스레드에게 양보함.
				//(동일 우선순위나 그 이상인 스레드한테)
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}
