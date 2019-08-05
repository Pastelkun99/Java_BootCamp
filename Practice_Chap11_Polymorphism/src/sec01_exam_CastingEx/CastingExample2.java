package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {

		Car car = new Car(); 	// Car 인스턴스 생성 new FireEngine(); 으로 바꾸면 해결됨.
		// Car car = null; Car 인스턴스 생성

		// 조상타입의 인스턴스를 가지고 자손타입의 인스턴스를 다룰 수 없다.
		// (리모컨의 기능이 small -> many 로는 불가)
		// 반대는 허용.

		// Car2는 null 초기화
		Car car2 = null;
		FireEngine fe = new FireEngine(); // fe도 null초기화

		// Car에 drive()메서드 호출
		car.drive();
		// 자손타입의 인스턴스를 가지고 조상타입의 인스턴스를 다룰 수 없다.
		// 리모콘의 기능이 small -> many로는 불가
		// 반대는 허용
		// car = fe; -> 이 주석을 해제하여도 에러가 해결됨. 업캐스팅

		fe = (FireEngine)car; // 컴파일은 ok 실행시 에러가 발생(classCastException발생)
		fe.drive();
		car2 = fe;
		car2.drive();
		fe.water();
	}

}
