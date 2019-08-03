package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		
		// String클래스의 참조변수 name, str
		String name = new String("Ja" + "Va");
		String str = new String(name + 8.0);
		
		// anytype + 문자열 = 문자열
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); // '+' 는 양쪽의 타입을 각각 문자열화 하여 연결해줍니다.
		System.out.println(" " + 7);
		
	    // 1234567은 데이터 타입이 무엇인가? = 정수형
		System.out.println(1234567);
		
        // 이 경우엔 문자열 타입, 이 테크닉이 가끔씩 쓰일 때가 있습니다.
		System.out.println("" + 1234567);
	}

}
