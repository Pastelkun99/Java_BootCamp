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
			this.frame = "카본";
			this.money = "8천만";
		} else if (super.brand.equals("Giant")) {
			this.gear = 27;
			this.frame = "알미늄";
			this.money = "30만";
		} else if (super.brand.equals("Lespo")) {
			this.gear = 18;
			this.frame = "철";
			this.money = "5만";
		}
		System.out.println("기어는 " + gear + "입니다.");
		System.out.println("프레임은 " + frame + "입니다.");
		System.out.println("가격은 " + money + "입니다.");
	}
}
