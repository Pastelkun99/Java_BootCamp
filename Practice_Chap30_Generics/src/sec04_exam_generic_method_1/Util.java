package sec04_exam_generic_method_1;

public class Util {

	// <T>는 제네릭 타입 메서드를 의미하며, 리턴타입과 매개변수 제네릭 타입을 
	// <T>로 하겠다는 의미 외부로부터 T타입을 받아서 Box객체를 생성하여
	// 그 객체를 리턴하는 메서드
	
	public static<T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		// return this.box // static메서드에서는 this를 사용할 수가 없다.
		
		// 제네릭 타입 메소드에서 static뒤에 제네릭이 가능한 이유는 그 제네릭 타입이 메소드를 호출할 시점에 
		// 이미 결정이 되어있기 때문. 그러나 일관성이 없어서 짜증나는 부분이긴 하다.
	}
}
