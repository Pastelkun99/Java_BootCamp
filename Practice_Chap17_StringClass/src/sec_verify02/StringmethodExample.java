package sec_verify02;

public class StringmethodExample {

	public static void main(String[] args) {
		
		String a = new String("      java,");
		String b = new String("program,fighting       ");
		
		System.out.println("문자열 a와 문자열 b를 연결한 결과 : " + a + b);
		System.out.println("문자열 a의 공백을 제거한 결과 : " + a.trim() + b);
		System.out.println("문자열 a의 a를 1로 대체한 결과 : " + a.trim().replace("a", "1") + b.replace("a", "1"));
		System.out.println("분리된 0번 문자열 : " + a.trim().substring(0, 4).replace("a", "1"));
		System.out.println("분리된 1번 문자열 : " + b.trim().substring(0, 7).replace("a", "1"));
		System.out.println("분리된 2번 문자열 : " + b.trim().substring(8));
		System.out.println("문자열 a의 substring한 결과 : " + a.trim().substring(3).replace("a", "1") + b.trim().substring(0).replace("a", "1"));
		
	}
}
