package sec07_exam_synchronized.copy;

public class User1 extends Thread{

	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-1");
	}
	@Override
	public void run() {
		//������ü�� �ʵ��� memory���� 100���� �����ϰ� �ִ�.
		this.calculator.setMemory(100);
	}
	
	
}
