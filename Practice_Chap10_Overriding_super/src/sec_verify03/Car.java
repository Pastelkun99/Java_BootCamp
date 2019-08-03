package sec_verify03;

public class Car {

	int speed;
	
	public final void speedUp() {
		this.speed = speed + 10;
		System.out.println("현재 스포츠카의 속도는 " + this.speed + "Km 입니다.");
	}
	
	public void speedDown() {
		this.speed = speed - 10;
		System.out.println("현재 스포츠카의 속도는 " + this.speed + "Km 입니다.");
	}
	
	public void stop() {
		if(this.speed == 0)
		System.out.println("차를 멈춥니다.");
	}
}
