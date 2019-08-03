package sec01_exam;

public class SwitchCharExample {

	public static void main(String[] args) {

		char grade = 'B';

		// Switch 구문은 if문으로 완벽하게 대체가 가능하여 잘 쓰이지 않는 방법이지만,
		// true/false로 구분하기 어려운 조건이나 제한된 결괏값 중 하나를 택해야 할때는
		// switch 구문이 더 쉬울 수 있습니다.
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			// break 구문이 없다면, 이 구문을 실행 한 후 아래에 있는 모든 구문이 실행됩니다.
			// 따라서 조건에 맞는 코드가 실행된 뒤엔, break 구문을 통해 switch 구문을
			// 벗어날 수 있도록 설계합니다.
		case 'b':
		case 'B':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}
}