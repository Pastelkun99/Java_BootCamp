package sec01_exam_CastingEx;

//extends는 상속관계 (직접적 관계), FireEngine 클래스의 멤버는 몇개? = 5개
public class FireEngine extends Car {
	// 물을 뿌리는 기능

	public void water() {
		System.out.println("물을 뿌립니다.");
	}
}
