package sec07_Exam_Singleton;

public class Singleton {

	//접근제어자의 범위가 가장 좁은 private를 붙여서 외부에서는 new를 통해 인스턴스 생성불가함.
	//static은 클래스 영역에 올라감. 굳이 외부에서 new연산자를 통해서 생성하지 않아도 됨.
	
	private static Singleton singleton = new Singleton();
	
	//singleton의 기본생성자임. 역시 private 접근제어자라서 외부에서 접근 못함.
	//컴파일러는 기본 생성자가 없을시에는, 자동적으로 알아서 기본생성자를 제공함.
	
	private Singleton() {}
	
	//static 메서드만 getInstance는 singleton주소를 리턴함.
	public static Singleton getInstance() {
		
		//return this.singleton; 		//예외 발생 이유 : static에서는 인스턴스를 소환 불가능. new가 언제 생성될지알고?
		return Singleton.singleton;
	}
}
