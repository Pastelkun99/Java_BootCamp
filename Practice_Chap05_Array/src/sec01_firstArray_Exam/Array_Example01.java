package sec01_firstArray_Exam;

public class Array_Example01 {

	public static void main(String[] args) {

		// int형 배열명 score(참조변수)에 int[5] = 20바이트 생성후, 주소값을 넘겨줍니다.
		int[] score = new int[10]; 
		// 10개의 방에 0 (기본값)을 자동 초기화 시켜 입력합니다.
		int k = 1;
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70
		score[3] = 80;
		score[4] = 90;

		// score : int[] 주소값을 저장
		// score[i] : 인덱스에 있는 실제값을 의미

		// int tmp = score[3] + score[4]
		int tmp = score[k + 2] + score[4];

		// for문으로 배열의 모든 요소를 출력할 수 있습니다.
		// System.out.println() 메소드를 배열의 원소 수만큼 반복하는 것보다 쉽습니다.
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}

		System.out.println("tmp: " + tmp);
		System.out.println("score[7] : " + score[7]);
		System.out.println(score); // 주소값을 출력 (출력값 맨앞에 [ 가 붙은건 배열타입이라는 뜻임.)

	}

}
