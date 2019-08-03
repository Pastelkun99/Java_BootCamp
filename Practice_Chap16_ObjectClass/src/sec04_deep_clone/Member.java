package sec04_deep_clone;
//java.lang.Cloneable인터페이스를 구현한 클래스만 clone()을 호출할 수 있다.
//구현하지 아니하면 CloneNotSupportedException이 발생함

import java.util.Arrays;

public class Member implements Cloneable {

	//기본형타입은 얕은 복제를 해도 아무런 상관이 없이 복제가 된다.
	//하지만, 참조형 타입은 번지를 복제하기 때문에 문제가 발생된다.
	String name;
	int age;
	int[] scores = null;	//참조 타입
	Car car = null;
	
	//생성자
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복제(Object의 clone()메서드를 먼저 호출
		Member cloned = (Member)super.clone();
		//Arrays.copyof는 원본배열을 길이만큼 복사함.
		
		//참조타입의 경우는 반드시 프로그래머가 복제되는 코드를 삽입해줘야 함.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;		//깊은 복제를 한 cloned가 리턴됨.
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)this.clone();	//어떤 clone()이 호출되나?
		}
		catch (CloneNotSupportedException e) {}
		
		return cloned;
	}
}
