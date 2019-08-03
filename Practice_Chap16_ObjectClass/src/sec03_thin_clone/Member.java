package sec03_thin_clone;
//java.lang.Cloneable인터페이스를 구현한 클래스만 clone()을 호출할 수 있다.
//구현하지 아니하면 CloneNotSupportedException이 발생함

public class Member implements Cloneable {

	String id;
	String name;
	String password;
	int age;
	boolean adult;
	int[] scores = null;	//참조 타입
	
	//생성자
	public Member(String id, String name, String password, int age, boolean adult, int[] scores) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.scores = scores;
	}
	
	
	//얕은 복제한 인스턴스를 리턴
	public Member getMember() {
		Member cloned = null;
		try {
			//예외처리 꼭 해줘야함.(일반예외)
			cloned = (Member)this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("null");
		}
		return cloned; 	//얕은 복제 후 Member인스턴스 리턴함.
	}
}
