package sec_verify01;

public class SamsungCarExample {

	public static void main(String[] args) {
		
		SamsungCar sam = new SamsungCar();
		
		sam.setcompany("Samsung");
		sam.setmodel("SM5");
		sam.setcolor("white");
		sam.setmaxSpeed(240);
		
		if(sam.company == null || sam.model == null || sam.color == null || sam.maxSpeed == 0) {
			System.out.println("");
		}
		else {
			System.out.println(sam);	
		}
		

	}

}
