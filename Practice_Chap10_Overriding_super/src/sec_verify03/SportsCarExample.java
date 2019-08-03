package sec_verify03;

public class SportsCarExample {

	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		System.out.println("현재 스포츠카의 속도는 " + sc.getSpeed() + "Km 입니다.");
		sc.speedUp();
		sc.speedUp();
		sc.speedUp();
		sc.speedDown();
		sc.speedDown();
		sc.speedDown();
		sc.stop();
		
	}
}
