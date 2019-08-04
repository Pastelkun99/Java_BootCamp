package sec_verify01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		//cal.powerOn();
		
		int result1 = cal.plus(7,4);
		System.out.println("result1: " + result1);
		
		double result2 = cal.divide(10, 4);
		System.out.println("result2: " + result2);
		
		cal.powerOff();
		
	}

}
