package sec06_verify;

public class HankookTire implements Tire {

	static int i;
	
	@Override
	public void roll() {
		for(i = 0; i<4; i++) {
			System.out.println((i+1) + "��° �ѱ�Ÿ�̾ �������ϴ�.");
		}
		
	}

}
