package sec03_verify;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void smartSkill() {
		System.out.println("SMART ����� �����մϴ�.");
	}

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
		
		if(volume > 5) {
			System.out.print("����ƮTV�� ������ �ִ�ġ�� 10 �Դϴ�. ");
			System.out.println("������ " + this.volume + "���� �����մϴ�!");
		}
		else if(volume <= 5 && volume >=0) {
			System.out.print("����ƮTV�� ������ �ּ�ġ�� 0 �Դϴ�. ");
			System.out.println("������ " + this.volume + "���� �����մϴ�!");
		}
		System.out.println("���� ���� : " + this.volume);
	}

}
