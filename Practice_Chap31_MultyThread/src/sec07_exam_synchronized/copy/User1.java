package sec07_exam_synchronized.copy;

public class User1 extends Thread{

	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-1");
	}
	@Override
	public void run() {
		//공유객체의 필드인 memory값을 100으로 설정하고 있다.
		this.calculator.setMemory(100);
	}
	
	
}
