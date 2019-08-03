package sec01_exam;

public class IfExample {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("점수를 입력해주세요");
		 * 
		 * int score=scanner.nextInt();
		 */

		int score = 93;
		// score 변수의 값을 바꾸어 실행해보세요.

		if (score >= 90) {
			System.out.println("점수가 90점보다 높습니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score < 90) {
			System.out.println("점수가 90점보다 낮습니다.");
			// {}는 한줄일때는 생략할 수 있지만, 웬만하면 묶어주는게 보기에 좋습니다.
			// 코딩 스타일에 따라 취향에 맞는 방법을 사용하시기 바랍니다.
			System.out.println("등급은 B입니다.");
		}
		
	}
}
