package sec01_exam_CastingEx;

//조상클래스 멤버갯수 : 4개
public class Car {

	String color;
	int door;
	
	// 운전하는 기능
	void drive() {
		System.out.println("자동차가 앞으로 가고 있습니다.");
	}
	
	//멈추는 기능
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
