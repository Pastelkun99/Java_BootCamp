package sec_verify02;

public class MidFielder extends Player {

	int pass;
	
	public MidFielder(String name, int age, int backNumber, int spd, int pass) {
		super(name, age, backNumber, spd);
		this.pass = pass;
		
	}
	
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public int getPass() {
		return pass;
	}
	
	public void infoPrint() {
		System.out.println("�̵��ʴ� ������ �Ұ��մϴ�.");
		super.infoPrint();
		System.out.println("�н� Ƚ�� : " + this.pass);
	}
}
