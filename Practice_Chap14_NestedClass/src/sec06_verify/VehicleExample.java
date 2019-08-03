package sec06_verify;

public class VehicleExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		
		anony.field.run();

		anony.passengerCar();
		
		anony.airplane(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("==========================================");
				System.out.println("비행기가 이륙합니다.");
				this.speedup();
			}
			
			@Override
			public void speedup() {

				for(int i = 0; i<=9; i++) {
					System.out.println("비행기의 현재 스피드 : " + (i*100) + "Km 입니다.");
				}
				System.out.println("==========================================");
			}
			
		});
	}

}
