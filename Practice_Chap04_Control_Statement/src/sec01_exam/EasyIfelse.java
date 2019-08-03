package sec01_exam;

public class EasyIfelse {

	public static void main(String[] args) {
		
		int score = 81;
		
		// IF문
		// if( 조건 ) {
		//		해당 조건이 True일때 수행되어야 할 코드
		// } else if ( 조건 ) {
		// 		if에 쓰인 조건이 아닌 다른 조건을 만족할때 수행되어야 할 코드
		// } else {
		// 		앞선 모든 조건에 해당하지 않을 경우 수행되어야 할 코드
		// }
		
		
		if(score >= 70 && score <= 100) {
			System.out.println("시험에 합격하였습니다.");
		}
		else if(score >= 0 && score < 70){
			System.out.println("시험에 불합격하였습니다.");
		}
		else {
			System.out.println("점수의 범위 0~100 을 벗어났습니다.");
		}
		
		// 코드를 보면 이해하기가 쉽습니다.

	}

}
