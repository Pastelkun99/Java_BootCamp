package sec05_exam_InterfaceExample_Direct;

public class InterfaceExample {

	public static void main(String[] args) {
		//클래스B가 다 완성되어야 비로소 클래스 A에 선언되어 있는
		//methodA()를 호출 할 수가 있다.(이것이 직접적 관계)
		
		A a = new A();
		B b = new B();
		
		a.methodA(new B());
		a.methodA(b);
	}
	
}
