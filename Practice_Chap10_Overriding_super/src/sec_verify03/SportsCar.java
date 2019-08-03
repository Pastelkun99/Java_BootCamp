package sec_verify03;

public class SportsCar extends Car {

	public int getSpeed() {
		return super.speed;
	}
	
	public void stop() {
		if(super.speed == 0) {
			//System.out.println("Â÷¸¦ ¸ØÃä´Ï´Ù.");
			super.stop();
			System.out.println("½ºÆ÷Ã÷Ä«¸¦ ¸ØÃä´Ï´Ù.");
			System.out.println("ÇöÀç ½ºÆ÷Ã÷Ä«ÀÇ ¼Óµµ´Â " + getSpeed() + "Km ÀÔ´Ï´Ù.");
		}
		else {
			System.out.println("ºÎ¸ªºÎ¸ª");
		}
	}
}
