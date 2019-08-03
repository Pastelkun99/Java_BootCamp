package sec_verify00;

public class MyMathMethodExample {

	public static void main(String[] args) {
		
		MyMathMethod my = new MyMathMethod();
		System.out.println("클래스(static)메서드 add \t호출 " + MyMathMethod.add(200l, 100l));
		System.out.println("클래스(static)메서드 subtract \t호출 " + MyMathMethod.subtract(200l, 100l));
		System.out.println("클래스(static)메서드 multiply \t호출 " + MyMathMethod.multiply(200l, 100l));
		System.out.println("클래스(static)메서드 divide \t호출 " + (double)MyMathMethod.divide(200l, 100l));
		
		System.out.println("인스턴스 메서드 add \t\t호출 " + my.add());
		System.out.println("인스턴스 메서드 subtract \t호출 " + my.subtract());
		System.out.println("인스턴스 메서드 multiply \t호출 " + my.multiply());
		System.out.println("인스턴스 메서드 divide \t\t호출 " + (double)my.divide());
	}

}
