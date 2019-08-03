package sec02_try_catch_finally;

public class TryCatchExample {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0); 	//try안에서 예외가 나오면 catch 구문을 출력
		}
		catch (Exception e) {
			System.out.println(5); //5는 출력이 되지 않는다. 왜?
		}
		
		System.out.println(6);
	}

}
