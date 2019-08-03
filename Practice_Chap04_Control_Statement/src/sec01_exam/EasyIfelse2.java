package sec01_exam;

public class EasyIfelse2 {

	public static void main(String[] args) {
		
		int doobooprice = 850;
		
		if(doobooprice > 1000) {
			System.out.println("두부를 사지 않습니다.");
		}
		else if(doobooprice > 0 && doobooprice <= 1000) {
			System.out.println("두부를 샀습니다.");
		}
		
	}

}
