package sec06_exam_unsynchronized;

public class MainClassExample {


	public static void main(String[] args) {
		//공유객체 생성
		Calculator calculator = new Calculator();
		
		// 문제가 무엇인가? 출력결과를 보면, User2 가 변경한 값으로 다 출력된다.
		// 과연 User1 스레드는 원하는 결과값인가?
		// 이 문제는 이제 어떻게 해결해야 할까? 바로 동기화를 이용하면 된다.
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
