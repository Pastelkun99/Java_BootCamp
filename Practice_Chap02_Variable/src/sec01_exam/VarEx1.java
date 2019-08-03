package sec01_exam;

public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.printf("%d %d %n", year, age); //%d는 decimal(10진수)의 약자, %n : 줄바꿈(개행)
		// 위와 같은 타입은 C언어에서 자주 쓰이던 방식입니다. 자바에서는 주로 '+'를 사용하여 문자열과 연결합니다.
		
		System.out.println(year); 
		System.out.println(age + "김민수"); // 변수명 대입하고 출력후, 개행한다. age는 문자열로서 삽입
		
		System.out.println();
		
		year = age + 2000;   // 변수 age의 값에 2000을 더해서 변수 year에 저장합니다.
		age = age + 1;       // 변수 age에 저장된 값을 1 증가시킵니다.
		
		System.out.println(year);
		System.out.println(age);

	}

}
