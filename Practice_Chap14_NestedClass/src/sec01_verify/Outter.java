package sec01_verify;

public class Outter {

	public Outter() {
		System.out.print("외부클래스 Outter 의 인스턴스를 생성한 후, ");
	}
	class Inner {
		
		int x = 100;
		public Inner() {
			System.out.println("인스턴스멤버클래스(Inner)의 인스턴스를 생성하여 출력한 값 : " + x);
		}
	}
}
