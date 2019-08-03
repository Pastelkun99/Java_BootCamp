package sec01_exam;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		int a = 1000000;
		int b = 1000000;
		long c = (long)a*b;
		System.out.println("값 = " + c);
		
	
		float pi = 3.141592f;
		double shortPi = Math.round(pi*100)/100.0;
		System.out.println("소수점 = " + shortPi);
		/*Math.round(3.141592f*1000)/1000f;
		Math.round(3141.592f)/1000f;*/
		
		System.out.println("9 >> 2 = " + (9>>2)); // 자릿수만큼의 0을 시프트함.
		System.out.println("7 << 3 = " + (7<<3));
		}
}