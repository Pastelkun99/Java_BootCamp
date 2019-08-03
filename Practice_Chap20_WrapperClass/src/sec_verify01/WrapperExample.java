package sec_verify01;

public class WrapperExample {

	public static void main(String[] args) {
		
		Integer intObject = new Integer(10);

		Integer intObject2 = new Integer(20);
		int i = intObject2;
		
		
		System.out.println("i를 자동 박싱한 intObjcet의 값 : " + intObject);
		System.out.println("intObject를 i로 자동 언박싱한 값 : " + i);
	}
}
