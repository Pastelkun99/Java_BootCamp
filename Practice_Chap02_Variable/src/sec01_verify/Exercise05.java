package sec01_verify;

public class Exercise05 {

	public static void main(String[] args) {
		
		int intValue = 44032;
		
		char charValue = (char)intValue;
		System.out.println("intValue값을 charValue로 강제캐스팅 결과값	: " + charValue);

		long longValue = 500;
		intValue = (int)longValue;
		System.out.println("doubleValue값을 intValue로 강제캐스팅 결과값	: " + intValue);
		
		double doubleValue = 3;
		intValue = (int)doubleValue;
		System.out.println("doubleValue값을 intValue로 강제캐스팅 결과값	: " + intValue);
		
	}

}
