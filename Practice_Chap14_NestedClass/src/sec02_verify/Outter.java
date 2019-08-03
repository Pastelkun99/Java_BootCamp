package sec02_verify;

public class Outter {

	public Outter() {
		System.out.println("외부 클래스를 생성하지 않고, 정적멤버클래스(Inner)의 정적 멤버 CV 값 : " + staticInner.CV);
	}
	
	
	public static class staticInner {
		
		static int CV = 500;
		int iv = 200;
		public staticInner() {
			System.out.println("외부 클래스를 생성하고, 정적멤버클래스(Inner)의 인스턴스 멤버 IV 값 : " + this.iv);
		}
	}
}
