package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		//Fightable f = new Fighter();
		//Unit f = new Fighter();
		
		/*
		 * A instanceof B 란 : A가 B타입일 경우 true를 반환한다.
		 * 즉, A가 B로 형변환(TypeCasting)된다는 의미이다.(조상클래스란 말이다.)
		 * 다형성의 개념을 떠올려보자.(조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있는 것.)
		 * 상속계층도를 그려보자.
		 */

		if(f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 클래스의 자손입니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 클래스의 자손입니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 클래스의 자손입니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
	}

}
