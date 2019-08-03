package sec01_exam;

public class ForExample01 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		/*
		 * 반복문의 종류에는 while 문과, for문이 있습니다. 문법에만 차이가 있을 뿐,
		 * 작동 원리는 해당하는 코드를 반복적으로 실행하는 것입니다. 
		 * 다만 이 둘은 무엇을, 어떻게, 얼마나 반복할 것인가를 나타내는 방식에 차이가 있습니다.
		 */
	}
}
