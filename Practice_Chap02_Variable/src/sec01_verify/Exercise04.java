package sec01_verify;

public class Exercise04 {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		char charValue = '��';
		
		int intValue = byteValue;
		System.out.println("byteValue���� intValue�� �ڵ�ĳ���� �����	: " + intValue);
		
		intValue = charValue;
		System.out.println("charValue���� intValue�� �ڵ�ĳ���� �����	: " + intValue);
				
		intValue = 500;
		
		long longValue;
		longValue = intValue;
		System.out.println("intValue���� longValue�� �ڵ�ĳ���� �����	: " + longValue);
		
		intValue = 200;
		
		double doubleValue;
		doubleValue = intValue;
		System.out.println("intValue���� doubleValue�� �ڵ�ĳ���� �����	: " + doubleValue);
		
	
	}

}
