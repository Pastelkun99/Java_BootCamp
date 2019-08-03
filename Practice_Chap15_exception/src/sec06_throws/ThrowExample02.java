package sec06_throws;

public class ThrowExample02 {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();	
		}
		
	}
	public static void findClass() throws ClassNotFoundException {
		//ClassNotFoundException가 발생가능한 일반 예외이다.
		Class clazz = Class.forName("java.lang.String2");	//실제 예외가 발생하는 부분
	}

}
