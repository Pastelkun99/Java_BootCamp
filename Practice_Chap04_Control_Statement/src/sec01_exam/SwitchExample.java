package sec01_exam;

public class SwitchExample {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		// 1부터 6까지의 숫자 중 하나를 return 합니다.

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");

		}

	}

}
