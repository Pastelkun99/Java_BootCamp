package sec06_exam_unsynchronized;

public class Calculator {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	public void setMemory(int memory) {
		
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
