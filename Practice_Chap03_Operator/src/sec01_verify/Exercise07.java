package sec01_verify;

public class Exercise07 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println("1 + x << 3의 값 : " + ((x + 1)<<3));
		// 시프트연산자는 산술연산자보다 우선순위가 낮다.
		
		System.out.println("y >= 5 || x < 0 && x > 2의 값은 : " + (y >= 5 || x < 0 && x > 2));
		// or연산자는 and연산자보다 우선순위가 낮다.
		
		System.out.println("y += 10 - x++의 값 : " + (y += 10 - x++));
		// x가 후위감소하므로, 위의 식에서는 (y + 10) - 2 를 수행하며, 이후 x의 값이 3이 됨. 
		
		System.out.println("x += 2의 값 : " + (x += 2));
		// 이전 증가연산자 때문에 x의 값이 3이 되었음.
		
		System.out.println("!('A' <= c && c <='Z')의 값 : " + (!('A' <= c && c <='Z')));
		// char c = 'A'는 'Z'값보다는 작고, 'A'값과 같음. 결국 &&이 모두 참이므로 true값이 도출되나, not연산자 때문에 false가 반환됨.
		
		System.out.println("'C' - c의 값 : " + ('C' - c));
		// 'C'의 int 값은 67, 'A'의 int값은 65이다. 결국 67 - 65
		
		System.out.println("'5' - '0' 의 값 : " + ('5' - '0'));
		// '5'의 int 값은 53, '0'의 int 값은 48이다. 결국 53 - 48
		
		System.out.println("++c의 값 : " + (++c));
		
		System.out.println("c++의 값 : " + (c++));
		// 후위증가연산자 때문에 c의 값이 1 증가함.
		
		System.out.println("c의 값 : " + c);

	}

}
