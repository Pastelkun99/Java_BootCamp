package sec01_firstArray_Exam;

public class Array_Example02 {

	public static void main(String[] args) {

		// int형 배열명 score(참조변수)에 int[5] = 20바이트 생성후, 주소값을 넘겨줍니다.

		int sum = 0; // 총점을 저장하기 위한 변수
		float average = 0.0f; // float 변수에 f가 붙지 않은 데이터 입력시 컴파일 에러가 발생합니다.

		// 선언과 동시에 초기화할 수 있습니다.
		int[] score = new int[] { 100, 88, 100, 100, 90 };

		System.out.println("배열의 길이 : " + score.length);

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 배열값 누적
		}

		// 계산결과를 float로 얻기 위함입니다.
		average = sum / (float) score.length;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
