package sec04_verify;

public class NestedAccessExample {

	public static void main(String[] args) {

		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		
		inner.method1();
		
	}

}
