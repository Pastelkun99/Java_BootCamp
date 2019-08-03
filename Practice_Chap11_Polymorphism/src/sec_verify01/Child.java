package sec_verify01;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("오버라이딩한 자손 클래스 메서드");
	}
	
	public void method3() {
		System.out.println("자손 클래스 메서드 3 호출");
	}
}
