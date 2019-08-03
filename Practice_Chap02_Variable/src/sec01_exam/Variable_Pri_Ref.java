package sec01_exam;

public class Variable_Pri_Ref {

	public static void main(String[] args) {

		// 기본형 변수
		int a; // 정수값을 저장하기 위해 선언
		a = 10; // 실제 값을 저장

		// int a = 10; 처럼 선언과 값 저장을 동시에 할 수 있으며,
		// 특수한 경우를 제외하고 이 방법을 더 자주 쓰게 됩니다.

		// 참조형 변수
		// 참조형 변수는 변수에 해당 데이터가 자리한 메모리의 주소가 저장됩니다.
		// 따라서 null 등으로 초기화가 가능합니다.
		String str = null;
		str = new String("자바");
		// str = "자바"; 와 동일한 의미를 가집니다. 이처럼 선언한 것은 String이 하나의 객체로 취급받는다는 것을
		// 보여주기 위한 것으로, 실제로 이렇게 String 변수를 선언하고 사용하는 일은 드뭅니다.

		System.out.println(str); // 자바로 출력이 되는 것을 확인할 수 있습니다.

		System.out.println("a의 값 : " + a);
		System.out.println("웰컴 " + str + " !");

		String str2 = null;
		System.out.println(str2);

	}

}
