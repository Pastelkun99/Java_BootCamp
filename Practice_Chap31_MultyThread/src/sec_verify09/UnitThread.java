package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup threadgroup, String threadName) {
		super(threadgroup, threadName);
	}
	
	@Override
	public void run() {
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("���� ���� ���� ������ �� : " + Thread.currentThread().getName() + "\t\t������ �׷� �� : " + str
								+	"\t\t�θ� �׷� �� : " + mainGroup.getParent().getName());
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(this.getName() + " Interrupted!");
				break;
			}
		}
			System.out.println(this.getName() + " �����!");
	}
}
