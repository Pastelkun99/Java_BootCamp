package sec04_exam_Default_StaticMethod_Example;

public class Child extends Parent implements MyInterface, MyInterface2 {

	//parent조상클래스를 상속받고, 아울러 인터페이스 1,2를 구현함.
	//단, 인터페이스에 디폴트메서드와 static메서드만 있기에 재정의할 메서드가 없다.
	//인터페이스에 추상메서드가 있으면 앞서 강의에서도 말했지만, 반드시 재정의가 필요하다.
	
	public void childmethod() {
		System.out.println("자손클래스에서 호출한 메서드");
	}
	
	@Override
	public void method1() {
		System.out.println("자손클래스에서 Myinterface1의 method1()을 " + " 오버라이딩한 메서드");
	}
}
