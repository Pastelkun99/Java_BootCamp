package sec01_firstArray_Exam;

public class Array_Example07 {

	public static void main(String[] args) {

		int[] ball = new int[5];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = (int) (Math.random() * 10);
		}

		System.out.println("정렬 전");

		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}

		// arrays.sort[ball]; <-- 아래 버블 소팅이랑 같은 것.
		// 버블 소팅을 하기 위해서는 더블루프 + 조건문 필수입니다. 잊지 않도록 합시다.
		// 버블 소팅이 궁금하시다면 구글에서 버블 정렬을 검색합니다!

		for (int i = 0; i < ball.length; i++) {

			for (int j = 0; j < ball.length - 1; j++) { // 꼭 -1 을 붙여줘야함.
				// 버블 소팅(정렬)
				if (ball[j] > ball[j + 1]) {
					int temp = ball[j]; // 두 수를 바꾸기 위해 temp 생성.
					ball[j] = ball[j + 1];
					ball[j + 1] = temp;
				}
			}
		}

		System.out.println("정렬 후");

		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}
	}

}
