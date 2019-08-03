package sec16.exam02_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		//현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println(threadGroup1);
		
		//메인그룹의 하위그룹으로 만들어진다.
		ThreadGroup myGroup = new ThreadGroup("My Group");
		WorkThread workThreadA = new WorkThread(myGroup, "WorkThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "WorkThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println(" [ 메인 스레드 그룹의 list()메서드 호출 후 출력 내용 ]");
		
		//현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//위에 얻은 그룹의 모든 정보가 출력됨(하위 그룹 포함)
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		//Mygroup에 포함된 WorkThreadA, B가 인터럽트되어 종료됨.(스레드 그룹을 쓰는 궁극적 이유)
			myGroup.interrupt();
	}
}
