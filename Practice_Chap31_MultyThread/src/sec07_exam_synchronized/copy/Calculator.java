package sec07_exam_synchronized.copy;

public class Calculator {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	// 동기화 메서드, 확실히 공유객체에 접근하기 위해서 user1이 먼저 접근하고 끝낸다음,
	// user2가 접근하므로 속도가 떨어진다. 하지만 데이터의 신뢰성은 보장된다.
	// 이전 exam06에서 synchronized를 붙인 것 밖에 없다.
	public synchronized void setMemory(int memory) {
		
		this.memory = memory;	//초기화
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		//현재 실행중인 스레드 이름과 memory값 출력
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
