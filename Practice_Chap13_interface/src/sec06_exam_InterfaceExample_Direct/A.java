package sec06_exam_InterfaceExample_Direct;


//직접적 관계에 놓인 클래스 A와 B
//A클래스는 B클래스를 사용하는 입장

public class A {

	//클래스 B가 완성이 되지 않아도 선언부 즉 인터페이스에 있는 추상메서드인
	//선언부만 알고 있으면 언제든지 호출이 가능해진다.
	//이것이 간접적 관계인 것이다.
	
	public void method(I i) {
		i.methodB();
	}
}
