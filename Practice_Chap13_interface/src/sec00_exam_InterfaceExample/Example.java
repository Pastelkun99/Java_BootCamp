package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {

		// 인터페이스를 구현했다라는 것은 구현클래스가 인터페이스의 자손클래스가 됨을 의미합니다.
		// 따라서 다형성이 적용됩니다.

		A a = new Person();
		Person p = new Person();

		a.method();
		// a.method2();
		p.method();

		A a1 = new Member(); // 인터페이스 필드의 다형성이 적용
		a1.method();

	}

}
