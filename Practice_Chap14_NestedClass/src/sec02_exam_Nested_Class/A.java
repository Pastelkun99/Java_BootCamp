package sec02_exam_Nested_Class;

public class A {
//생성자
	
	public A() {
		System.out.println("A객체가 생성됨");
		B b = new B();	//왜 가능하노? = 멤버라서
		b.a = 20;
		b.method1();
	}
	
	//인스턴스 멤버클래스인 B
	class B {
		int a = 10;
		//static int b = 20;	static은 선언 불가
		public B() {
			System.out.println("B객체가 생성됨");
		}
		void method1() {
			System.out.println("B클래스의 멤버메서드 method1이 호출됨.");
		}
		//static void method2(); 에러발생
	}
	
	//정적 멤버클래스인 C
	static class C {
		
		public C() {
			System.out.println("static C 객체가 생성됨.");
		}
		
		int b = 10;
		static int c = 20;
		
		void method2() {
			System.out.println("static C 클래스의 멤버메서드 method2이 호출됨");
		}
		
		static void method3() {
			System.out.println("static C 클래스의 static 멤버메서드 method3이 호출됨");
		}
	}
	
	void method() {
		
		class D {
			
			public D() {
				System.out.println("D객체가 생성됨");
			}
			int e = 30;
			//static int f = 30;
			void localmethod() {
				System.out.println("로컬클래스인 D클래스의 멤버메서드 method이 호출됨.");
				System.out.println(e);
			}
		}
		//로컬클래스는 메서드 내부에서만 생성하고 사용할 수 있다.
		D d = new D();
		d.e = 50;
		d.localmethod();
	}
}
