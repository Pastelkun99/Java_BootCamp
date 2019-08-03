package sec_verify00;

public class MyMathMethod {
	
	public static long add(long a, long b) 
	{
		return  a + b;
	}
	public static long subtract(long a, long b) 
	{
		return  a - b;
	}
	public static long multiply(long a, long b) 
	{
		return a*b;
	}
	public static long divide(long a, long b) 
	{
		return a / b;
	}
	
	private long a = 200l;
	private long b = 100l;
	
	public long add() {
		return a+b;
	}
	public long subtract() {
		return a-b;
	}
	public long multiply() {
		return a*b;
	}
	public long divide() {
		return a/b;
	}
}
