package sec01_exam_contentSender;

public class SenderExample {

	public static void main(String[] args) {

		// 추상클래스는 인스턴스를 절대로 생성할 수 없습니다.
		// ContentSender sc = new ContentSender(); 예외 이유?

		// 추상클래스도 조상이기 때문에 다형성이 적용될 수 있습니다.
		// 단, 조상클래스 선언된 추상메서드를 모두 구현한 자손클래스만 대입이 가능합니다.

		ContentSender cs = new letterSender("SMS문자", "김우진", "회식합시다.");
		cs.sendMsg("박현수");
		System.out.println();

		letterSender ls = new letterSender("SMS문자", "박현수", "부장님이 회식하자고 하십니다.");
		kakaoSender ks = new kakaoSender("카카오톡", "이재훈", "잘 알겠습니다.");

		// 조상클래스의 추상메서드를 오버라이딩한 메서드가 호출됩니다. 각기 다른 실행 결과를 얻을 수 있습니다.
		ls.sendMsg("이재훈");
		System.out.println();
		ks.sendMsg("박현수");

	}

}
