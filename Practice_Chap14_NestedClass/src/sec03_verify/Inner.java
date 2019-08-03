package sec03_verify;

public class Inner {

	class InstanceInner {
		
		final static int CONST = 100;
		int iv = 100;
		
	}
	
	static class StaticInner {
		int cv = 200;
		static int CONST = 500;
	}
	
	void myMethod() {
		
		class LocalInner {
			int iv = 300;
			static final int CONST = 300;		
			}
		
		LocalInner ln = new LocalInner();
		System.out.println("myMethod()를 호출후 LocalInner클래스 생성후 멤버변수 값 출력 : " + ln.iv);
		System.out.println("myMethod()를 호출후 final static변수 값 출력 : " + LocalInner.CONST);
	}
}
