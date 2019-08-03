package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {
		
		Number number = new Number();
		
		IncreaseNumberThread i1 = new IncreaseNumberThread(number);
		i1.start();
		
		IncreaseNumberThread i2 = new IncreaseNumberThread(number);
		i2.start();
		i2.setName("Second Thread");
		
		IncreaseNumberThread i3 = new IncreaseNumberThread(number);
		i3.start();
		i3.setName("Third Thread");
				
		
	}
}
