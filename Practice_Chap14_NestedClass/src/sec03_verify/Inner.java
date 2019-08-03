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
		System.out.println("myMethod()�� ȣ���� LocalInnerŬ���� ������ ������� �� ��� : " + ln.iv);
		System.out.println("myMethod()�� ȣ���� final static���� �� ��� : " + LocalInner.CONST);
	}
}
