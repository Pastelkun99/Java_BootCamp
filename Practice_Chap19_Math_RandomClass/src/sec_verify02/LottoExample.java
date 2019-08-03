package sec_verify02;

public class LottoExample {

	public static void main(String[] args) {
		
		System.out.println("로또 번호 생성기 프로그램입니다.");
		System.out.println("자동으로 번호를 선택합니다.");
		
		int lotto[] = new int[6];
		int lottowin[] = new int[] {14, 22, 22, 10, 22, 27};
		System.out.println();
		System.out.print("선택 번호 : ");
		
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
		System.out.println();
		
		System.out.println("당첨 번호 : 14 22 22 10 22 27");
		//하나라도 맞지 않으면 꽝 처리함.
		
		if(lotto[1] != lottowin[1]);
		System.out.println("당첨 여부 : 당첨되지 않았습니다.");
	}
}

