package sec01_exam;

public class IfnestedExample {

	public static void main(String[] args) {

		int score = (int) (Math.random() * 20) + 81;
		// 0 <= Math.random() < 1 --> 0 <= m < 101 
		// int값이므로 소수점은 버려지고, 정수 값만 도출됩니다.
		// 즉 0부터 100까지의 정수 중 랜덤하게 하나를 추출하겠다는 뜻이 됩니다.

		System.out.println("점수 : " + score);
		String grade = null;

		if (score >= 90) {
			if (score >= 95)
				grade = "A+";
			else
				grade = "A-";
		} // 중첩 if문 (if else와 else문은 무한대로 중첩이 가능합니다.
		else {
			if (score >= 85)
				grade = "B+";
			else
				grade = "B-";
		}

		System.out.println("학점 : " + grade);
		// 실행할 때 마다 결과가 어떻게 변화하는지 잘 살펴보세요.
	}

}
