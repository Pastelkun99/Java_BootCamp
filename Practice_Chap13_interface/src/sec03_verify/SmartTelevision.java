package sec03_verify;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void smartSkill() {
		System.out.println("SMART 기능을 시작합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
		if(volume > 5) {
			System.out.print("스마트TV의 볼륨의 최대치는 10 입니다. ");
			System.out.println("볼륨을 " + this.volume + "으로 지정합니다!");
		}
		else if(volume <= 5 && volume >=0) {
			System.out.print("스마트TV의 볼륨의 최소치는 0 입니다. ");
			System.out.println("볼륨을 " + this.volume + "으로 지정합니다!");
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}

}
