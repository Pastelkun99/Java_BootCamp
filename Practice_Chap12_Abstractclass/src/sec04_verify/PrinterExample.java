package sec04_verify;

public class PrinterExample {

	public static void main(String[] args) {
		
		LaserPrinter laser = new LaserPrinter("SCX-6x45", "»ï¼ºÀüÀÚ", 1, 2, 10);
		InkjetPrinter ink = new InkjetPrinter("Officejet V40", "HP", 1, 4, 5);
		
		for(int i = 0; i<5; i++) {
			laser.print();
			System.out.println();
			ink.print();
			System.out.println();
		}

	}

}
