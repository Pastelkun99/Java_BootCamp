package sec01_exam;

//속성 2개와 기능이 하나도 없는 클래스가 만들어짐
//하나의 Java파일에는 접근제어자 public 오로지 한개여야만 한다.
// 접근제어자

// 1. private : 같은 클래스 내에서만 접근 가능
// 2. protected : 같은 패키지, 다른 패키지 자손 클래스에서만 접근 가능
// 3. default : 같은 패키지, 다른 패키지 접근 가능
// 4. public : 어떤 클래스나 다 접근 가능

public class Student {

	// 멤버변수 (필드)

	String name = "박영한";
	int age = 28;

	// Object 클래스의 toString()을 Student클래스가 오버라이딩 하고 있다.
	@Override
	public String toString() {
		return "이름 : " + this.name + ", 나이 : " + this.age;
	}
}
