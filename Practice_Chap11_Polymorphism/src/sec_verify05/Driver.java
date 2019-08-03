package sec_verify05;

public class Driver {

	public void drive(Vehicle vehicle) {
		System.out.println("조상클래스 타입에 적용되는 자손클래스들의 run메소드를 호출합니다.");
		System.out.print("Vehicle의 자손클래스인 ");
		vehicle.run();		
	}
	
}
