package sec_verify09;


public class ThreadGroupExample {

	public static void main(String[] args) {
		
		ThreadGroup tg1 = Thread.currentThread().getThreadGroup();
		System.out.println("현재 실행 중인 스레드 명 : " + Thread.currentThread().getName() + "\t\t스레드 그룹 명 : " + tg1.getName()
				+	"\t\t부모 그룹 명 : " + tg1.getParent().getName());
		
		ThreadGroup tg2 = new ThreadGroup("AGroup");
		UnitThread u2 = new UnitThread(tg2, "AGroup-Thread1");
		
		ThreadGroup tg3 = new ThreadGroup("BGroup");
		UnitThread u3 = new UnitThread(tg3, "BGroup-Thread1");
		
		u2.start();
		u3.start();
		
		ThreadGroup tg4 = new ThreadGroup(tg2, "ASubGroup");
		UnitThread u4 = new UnitThread(tg4, "A_SubgroupThread1");
		UnitThread u5 = new UnitThread(tg4, "A_SubGroupThread2");
		
		u4.start();
		u5.start();
		
		try {
			Thread.sleep(1000);
			tg4.interrupt();
			tg3.interrupt();
			tg2.interrupt();
			tg1.interrupt();
		} catch (InterruptedException e) {}
		
	}
}
