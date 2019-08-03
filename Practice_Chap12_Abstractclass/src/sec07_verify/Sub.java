package sec07_verify;

public class Sub extends Calc {
	
	@Override
	public double calculate() {
		return super.a - super.b;
	}
}
