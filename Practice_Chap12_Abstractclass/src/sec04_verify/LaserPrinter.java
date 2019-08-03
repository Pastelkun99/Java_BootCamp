package sec04_verify;

public class LaserPrinter extends Printer {

	static final int amountOfTonerToPrint = 10;
	private int amountOfToner;
	
	public LaserPrinter(String modelName, String manufacturer, int numberOfPaper, int numberOfPrinted, int amountOfToner) {
		super(modelName, manufacturer, numberOfPaper, numberOfPrinted);
		this.amountOfToner = amountOfToner;
	}
	
	public int getamountOfToner() {
		return amountOfToner;
	}
	
	@Override	
	public boolean print() {
	if(amountOfToner > 0) {
		System.out.println("������ ������ ���");
		System.out.println("������ : " + super.getManufacturer());
		System.out.println("�𵨸� : " + super.getModelName());
		System.out.println("������������ >> �μ���� : " + numberOfPaper + " ��� �ż� : " + numberOfPrinted + " ��� �ܷ� : " + amountOfToner);
		if(amountOfToner == 0) {
			return true;
		}
		numberOfPaper--;
		numberOfPrinted++;
		amountOfToner -= 10;
		return true;
	}
	else {
		System.out.println("��ʰ� �����մϴ�.");	
		System.out.println("������ : " + super.getManufacturer());
		System.out.println("�𵨸� : " + super.getModelName());
		System.out.println("������������ >> �μ���� : " + numberOfPaper + " ��� �ż� : " + numberOfPrinted + " ��� �ܷ� : " + amountOfToner);
		return false;
		}
	}
}
