package sec_verify06;

public class DmbCellPhone extends Cellphone {

	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void turnonDmb() {
		System.out.println("ä�� " + this.channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + this.channel + "������ �ٲߴϴ�.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
