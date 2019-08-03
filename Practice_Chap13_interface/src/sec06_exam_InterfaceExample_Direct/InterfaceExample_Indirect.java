package sec06_exam_InterfaceExample_Direct;

public class InterfaceExample_Indirect {

	public static void main(String[] args) {

		A a = new A();
		a.method(new B());
		
		//인터페이스 필드의 다형성
		I i = new B();
		i.methodB();
	}

}
