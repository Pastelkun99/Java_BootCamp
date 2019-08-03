package sec06_verify;

public class Anonymous {

	int bicycleSpeed = 0;
	int carSpeed  = 0;
	
	Vehicle field = new Vehicle() {
		
		@Override
		public void speedup() {

			bicycleSpeed = 0;
			System.out.println("�������� ���ǵ尡 ������ ���� �ֳ���?");
			for(int i = 0; i<=10; i++) {
				System.out.println("�������� ���ǵ� : " + (i*10) + "Km �Դϴ�.");
				if(i*10 == 100) {
					System.out.println("�����Ű� " + i*10 + "Km��� ���Ʊ���!");
					System.out.println("==========================================");
				}
			}
			
		}
		
		@Override
		public void run() {
			System.out.println("==========================================");
			System.out.println("�����Ű� �޸��ϴ�.");
			this.speedup();
		}
	};
	
	public void passengerCar() {
		
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void speedup() {
				carSpeed = 0;
				System.out.println("�ڵ����� ���ǵ尡 ������ ���� �ֳ���?");
				for(int i = 1; i<=6; i++) {
					System.out.println("���� ���� ��� : " + i + " ���Դϴ�.");
				}
				System.out.println("==========================================");
			}
			
			@Override
			public void run() {
				System.out.println("==========================================");
				System.out.println("�¿����� �޸��ϴ�.");	
				this.speedup();
			}
		};
		localVar.run();
	}
	
	public void airplane(Vehicle v) {
		v.run();
	}
}
