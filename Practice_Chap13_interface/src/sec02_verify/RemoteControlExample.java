package sec02_verify;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc = new Television();
		RemoteControl rc2 = new Audio();

		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(0);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc2.turnOn();
		rc2.setVolume(10);
		rc2.setVolume(0);
		rc2.setMute(true);
		rc2.setMute(false);
		rc2.turnOff();
		RemoteControl.changeBattery();
	}

}
