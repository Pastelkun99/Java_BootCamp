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
		System.out.println("0���� 1000������ ���� ���մϴ�.");
		System.out.println(Thread.currentThread().getName() + "�� ��� : " + sum);
	}
}
