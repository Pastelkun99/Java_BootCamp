package sec06_exam_Polymotphism_Vector;

public class Tv extends Product {

	// 조상클래스의 생성자 Product(int price)를 호출한다.
	public Tv() {
		super(100); // tv가격은 100만원
	}

	// Object클래스의 toString()을 오버라이딩 함.
	@Override
	public String toString() {
		return "Tv";
	}
}
