package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup threadgroup, String threadName) {
		super(threadgroup, threadName);
	}
	
	@Override
	public void run() {
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("현재 실행 중인 스레드 명 : " + Thread.currentThread().getName() + "\t\t스레드 그룹 명 : " + str
								+	"\t\t부모 그룹 명 : " + mainGroup.getParent().getName());
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(this.getName() + " Interrupted!");
				break;
			}
		}
			System.out.println(this.getName() + " 종료됨!");
	}
}
