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
				System.out.println("����Ⱑ �̷��մϴ�.");
				this.speedup();
			}
			
			@Override
			public void speedup() {

				for(int i = 0; i<=9; i++) {
					System.out.println("������� ���� ���ǵ� : " + (i*100) + "Km �Դϴ�.");
				}
				System.out.println("==========================================");
			}
			
		});
	}

}
