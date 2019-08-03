package sec16.exam02_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		//���� ����ǰ� �ִ� ������ �׷��� ����
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println(threadGroup1);
		
		//���α׷��� �����׷����� ���������.
		ThreadGroup myGroup = new ThreadGroup("My Group");
		WorkThread workThreadA = new WorkThread(myGroup, "WorkThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "WorkThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println(" [ ���� ������ �׷��� list()�޼��� ȣ�� �� ��� ���� ]");
		
		//���� ����ǰ� �ִ� ������ �׷��� ����
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//���� ���� �׷��� ��� ������ ��µ�(���� �׷� ����)
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		//Mygroup�� ���Ե� WorkThreadA, B�� ���ͷ�Ʈ�Ǿ� �����.(������ �׷��� ���� �ñ��� ����)
			myGroup.interrupt();
	}
}
