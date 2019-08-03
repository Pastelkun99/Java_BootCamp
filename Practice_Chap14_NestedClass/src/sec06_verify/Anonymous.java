package sec06_verify;

public class Anonymous {

	int bicycleSpeed = 0;
	int carSpeed  = 0;
	
	Vehicle field = new Vehicle() {
		
		@Override
		public void speedup() {

			bicycleSpeed = 0;
			System.out.println("자전거의 스피드가 음수일 리가 있나요?");
			for(int i = 0; i<=10; i++) {
				System.out.println("자전거의 스피드 : " + (i*10) + "Km 입니다.");
				if(i*10 == 100) {
					System.out.println("자전거가 " + i*10 + "Km라니 미쳤군요!");
					System.out.println("==========================================");
				}
			}
			
		}
		
		@Override
		public void run() {
			System.out.println("==========================================");
			System.out.println("자전거가 달립니다.");
			this.speedup();
		}
	};
	
	public void passengerCar() {
		
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void speedup() {
				carSpeed = 0;
				System.out.println("자동차의 스피드가 음수일 리가 있나요?");
				for(int i = 1; i<=6; i++) {
					System.out.println("차의 현재 기어 : " + i + " 단입니다.");
				}
				System.out.println("==========================================");
			}
			
			@Override
			public void run() {
				System.out.println("==========================================");
				System.out.println("승용차가 달립니다.");	
				this.speedup();
			}
		};
		localVar.run();
	}
	
	public void airplane(Vehicle v) {
		v.run();
	}
}
