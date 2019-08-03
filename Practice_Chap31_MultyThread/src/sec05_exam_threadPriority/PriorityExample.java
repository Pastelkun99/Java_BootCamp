package sec05_exam_threadPriority;

public class PriorityExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			Thread thread = new Calcthread("Thread : " + i);
			
			//1~9까지의 스레드
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
				//thread.setPriority(1);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
				//thread.setPriority(10);
			}
			thread.start();
		}
	}
	
	// 아무리 우선순위를 10으로 주었다 하나, 마치는 빈도가 높을 뿐이지 꼭 먼저 작업을 끝낸다고 보장할 수 있는 것은 아니다.
	// 어차피 자바는 순환 할당 방식 (Round-robin)방식으로 실행하므로, CPU의 상태에 따라 달라진다.
}
