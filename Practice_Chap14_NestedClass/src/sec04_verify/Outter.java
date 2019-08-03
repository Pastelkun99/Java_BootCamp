package sec04_verify;

public class Outter {

	int value = 10;
	
	public void method1() {
		int value = 30;
		System.out.println("method1의 value값 : " + value);
	}
	
	public class Inner {
		
		int value = 20;
		
		public void method1() {
			Outter.this.method1();
			System.out.println("Outter 클래스의 value 값 : " + this.value);
			System.out.println("Inner 클래스의 value 값 : " + Outter.this.value);
		}
	}
}
