package sec02_verify;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		if (this.volume <= MAX_VOLUME && this.volume > 5) {
			System.out.println("Audio ������ �ִ�ġ ���� 10 �Դϴ�. ������ " + this.volume + "���� �����մϴ�!");
			System.out.println("���� Audio ���� " + this.volume);
		} else if (this.volume <= 5 && this.volume >= MIN_VOLUME) {
			System.out.println("Audio ������ �ּ�ġ ���� 0 �Դϴ�. ������ " + this.volume + "���� �����մϴ�!");
			System.out.println("���� Audio ���� " + this.volume);
		}
	}

}
