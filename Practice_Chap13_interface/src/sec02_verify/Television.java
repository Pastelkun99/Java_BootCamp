package sec02_verify;

public class Television implements RemoteControl {
	
	private int volume;

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
		if(this.volume <=10 && this.volume > 5) {
			System.out.println("Television 볼륨의 최대치 값은 10 입니다. 볼륨을 " + this.volume + "으로 지정합니다!");
			System.out.println("현재 Television 볼륨 " + this.volume);
		}
		else if (this.volume <= 5 && this.volume >= 0) {
			System.out.println("Television 볼륨의 최소치 값은 0 입니다. 볼륨을 " + this.volume + "으로 지정합니다!");
			System.out.println("현재 Television 볼륨 " + this.volume);
		}

	}

	
}
