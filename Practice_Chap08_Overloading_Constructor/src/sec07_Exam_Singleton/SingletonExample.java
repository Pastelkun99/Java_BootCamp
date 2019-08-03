package sec07_Exam_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton(); 			private로 생성했기 때문에 해당 클래스가 아닌 다른 클래스에서 new를 통해 호출 할 수 없기 때문.
		//Singleton obj2 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		//사용자 정의 클래스의 Object의 equals()호출 --> 번지 비교
		if(obj1.equals(obj2))
			System.out.println("같은 Singleton 객체입니다.");
		else
			System.out.println("다른 Singleton 객체입니다.");

	}

}
