package sec11_exam_thread_join;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		// sumThread의 run()가 끝나지 않았을 때 getSum()을 호출하면 1~10000까지의 합이 나오리라는 보장이 없다.
		// 그래서 sumThread가 끝날때까지 기다려주는 코드가 필요하다. 그것이 바로 join이다.
		// System.out.Println("1~10000 까지의 합 : " + sumThread.getSum());
		try {
			sumThread.join(); 			//메인스레드는 sumThread가 끝날때까지 기다린다.(일시정지)
		} catch (InterruptedException e) {}
		
		System.out.println("1~ 10000 까지의 합 : " + sumThread.getSum());
	}
}
