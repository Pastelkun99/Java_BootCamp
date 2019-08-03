package sec01_verify;

public class Exercise02 {

	public static void main(String[] args) {
		
		int score = 85;

		String result = (!(score>90)) ? "가" : "나";
		
		System.out.println(result);
		
	}
	
	// 조건식을 보면 알 수 있습니다.
	// 처음에 score > 90은 조건식을 만족하지 않으므로, false가 됩니다.
	// 그 다음 괄호 밖에 있는 ! 연산자를 만나게 됩니다. 따라서 마지막 결과는 true가 됩니다.
	// 삼항연산자의 특성에 의해, 조건식이 true가 되면 콜론 기호 왼쪽에 있는 값이 선택됩니다.
	// 정답은 "가" 입니다.

}
