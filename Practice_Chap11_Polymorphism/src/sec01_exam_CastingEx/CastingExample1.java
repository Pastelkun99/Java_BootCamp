package sec01_exam_CastingEx;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (car)fe; 에서 형변환이 생략된 형태
		//car.water();	//컴파일 예외가 발생함. 근본에 차이가 있기 때문.
		fe2 = (FireEngine)car;	// 자손타임 <- 조상타입
		fe2.water();

	}

}
