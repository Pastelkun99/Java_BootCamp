package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		System.out.println("main()");
		//static�� static�� �θ� �� �ִ�.
		CallStackExample.firstMethod();
		System.out.println("main()�� �����ϴ�.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()");
		//static�� static���θ� �θ� �� �ִ�.
		CallStackExample.secondMethod();
		System.out.println("main()���� ���ư��ϴ�.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
		//static�� static���θ� �θ� �� �ִ�.
		System.out.println("firstMethod()���� ���ư��ϴ�.");
	}

}
