package sec02_verify;

public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		if(this.volume <=10 && this.volume > 5) {
			System.out.println("Television ������ �ִ�ġ ���� 10 �Դϴ�. ������ " + this.volume + "���� �����մϴ�!");
			System.out.println("���� Television ���� " + this.volume);
		}
		else if (this.volume <= 5 && this.volume >= 0) {
			System.out.println("Television ������ �ּ�ġ ���� 0 �Դϴ�. ������ " + this.volume + "���� �����մϴ�!");
			System.out.println("���� Television ���� " + this.volume);
		}

	}

	
}
