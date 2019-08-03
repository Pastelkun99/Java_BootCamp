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
		System.out.println("레이저 프린터 출력");
		System.out.println("제조사 : " + super.getManufacturer());
		System.out.println("모델명 : " + super.getModelName());
		System.out.println("레이저프린터 >> 인쇄용지 : " + numberOfPaper + " 출력 매수 : " + numberOfPrinted + " 토너 잔량 : " + amountOfToner);
		if(amountOfToner == 0) {
			return true;
		}
		numberOfPaper--;
		numberOfPrinted++;
		amountOfToner -= 10;
		return true;
	}
	else {
		System.out.println("토너가 부족합니다.");	
		System.out.println("제조사 : " + super.getManufacturer());
		System.out.println("모델명 : " + super.getModelName());
		System.out.println("레이저프린터 >> 인쇄용지 : " + numberOfPaper + " 출력 매수 : " + numberOfPrinted + " 토너 잔량 : " + amountOfToner);
		return false;
		}
	}
}
