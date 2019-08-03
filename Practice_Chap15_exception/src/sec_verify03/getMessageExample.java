package sec_verify03;

public class getMessageExample {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		catch (Exception e) {
			System.out.println("발생 오류의 메시지를 출력합니다. ==> " + e.getMessage());
		}

	}
}
