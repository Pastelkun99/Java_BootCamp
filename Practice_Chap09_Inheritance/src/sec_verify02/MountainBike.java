package sec_verify02;

public class MountainBike extends Bicycle {

	String frame;
	int gear;
	String money;

	public MountainBike(int id, String brand) {
		super(id, brand);
		prtinfo();
	}

	public void prtinfo() {
		if (super.brand.equals("Scott")) {
			this.gear = 30;
			this.frame = "ī��";
			this.money = "8õ��";
		} else if (super.brand.equals("Giant")) {
			this.gear = 27;
			this.frame = "�˹̴�";
			this.money = "30��";
		} else if (super.brand.equals("Lespo")) {
			this.gear = 18;
			this.frame = "ö";
			this.money = "5��";
		}
		System.out.println("���� " + gear + "�Դϴ�.");
		System.out.println("�������� " + frame + "�Դϴ�.");
		System.out.println("������ " + money + "�Դϴ�.");
	}
}
