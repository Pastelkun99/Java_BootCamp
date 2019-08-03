package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		
		double number = -2.78987434;
		
		System.out.println("number의 절댓값 : " + Math.abs(number));
		System.out.println("number의 올림값 : " + Math.ceil(number));
		System.out.println("number의 내림값 : " + Math.floor(number));
		
		System.out.println("9.0의 제곱근 : " + Math.sqrt(9));
		System.out.println("PI에서 가장 가까운 정수 : " + Math.rint(Math.PI));
		
		int lotto[] = new int[6];
		
		System.out.print("이번주 행운의 로또 번호는 : ");
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("입니다.");
	}
}
