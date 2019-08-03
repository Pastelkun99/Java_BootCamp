package sec_verify04_1;

public class IncreaseNumberThread extends Thread{

	private Number number;
	
	public IncreaseNumberThread(Number n) {
		this.number = n;
		this.setName("FirstThread");
	}
	
	@Override
	public void run() {
		number.addNum();
	}
}
