package sec03_verify;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		SmartTelevision st = new SmartTelevision();
		
		st.turnOn();
		st.setVolume(10);
		st.setVolume(0);
		st.setVolume(8);
		st.setMute(true);
		st.setMute(false);
		st.turnOff();
		RemoteControl.changeBattery();
		System.out.println();
		st.smartSkill();
		st.search("www.naver.com");
		
		
	}

}
