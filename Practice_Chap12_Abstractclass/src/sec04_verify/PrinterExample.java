package sec04_verify;

public class PrinterExample {

	public static void main(String[] args) {

		LaserPrinter laser = new LaserPrinter("SCX-6x45", "»ï¼ºÀüÀÚ", 1, 5, 10);
		InkjetPrinter ink = new InkjetPrinter("Officejet V40", "HP", 1, 4, 5);

		for(int i = 0; i<6; i++) {
			laser.print();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
				
		for(int j = 0; j<6; j++) {
			ink.print();
			System.out.println();
		}
	}

}
