package sec03_exam_Contsructor;

public class Data2 {

	int value;

	// 기본 생성자
	// public Data2(){}

	// 매개변수가 있는 생성자. 생성자가 1개라도 존재한다면, 컴파일러는 기본 생성자를 추가해주지 아니한다.

	public Data2(int x) {
		this.value = x; // this는 객체 자기 자신의 주소를 가지고 있다. (참조변수와 동일)
	}
}
