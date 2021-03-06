package sec_verify06;

public class DmbCellPhone extends Cellphone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	public void turnonDmb() {
		System.out.println("채널 " + this.channel + "번 DMB 방송 수신을 시작합니다.");
	}

	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + this.channel + "번으로 바꿉니다.");
	}

	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	@Override
	public String toString() {
		return "모델 : " + this.model + "\n" +
			   "색상 : " + this.color + "\n" + 
			   "채널 : " + this.channel + "\n";
	}
}
