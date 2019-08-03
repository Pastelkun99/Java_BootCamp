package sec06_exam_Polymotphism_Vector;

public class Audio extends Product {

	//조상클래스의 생성자 Product(int price)를 호출한다.
	public Audio() {
		super(50);		//audio가격은 300만원
	}
	
	//Object클래스의 toString()을 오버라이딩 함.
	@Override
	public String toString() {
		return "Audio";
	}
}
