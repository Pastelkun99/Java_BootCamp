package sec04_verify;

public class Outter {

	int value = 10;
	
	public void method1() {
		int value = 30;
		System.out.println("method1�� value�� : " + value);
	}
	
	public class Inner {
		
		int value = 20;
		
		public void method1() {
			Outter.this.method1();
			System.out.println("Outter Ŭ������ value �� : " + this.value);
			System.out.println("Inner Ŭ������ value �� : " + Outter.this.value);
		}
	}
}
