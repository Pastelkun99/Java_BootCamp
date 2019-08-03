package sec_verify04_1;

public class Number {

	public Number() {}
	
	public synchronized void addNum() {
		
		int sum = 0;
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i<1000; i++) {
				sum += i;
			}
		} catch (InterruptedException e) {}
		System.out.println("0에서 1000까지의 합을 구합니다.");
		System.out.println(Thread.currentThread().getName() + "의 결과 : " + sum);
	}
}
