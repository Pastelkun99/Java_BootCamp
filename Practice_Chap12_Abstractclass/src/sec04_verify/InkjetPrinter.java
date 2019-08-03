package sec04_verify;

public class InkjetPrinter extends Printer {
	
	static final int amountOfInkToPrint = 5;
	private int amountOfInk;
	
	public InkjetPrinter(String modelName, String manufacturer, int numberOfPaper, int numberOfPrinted, int amountOfInk) {
		super(modelName, manufacturer, numberOfPaper, numberOfPrinted);
		this.amountOfInk = amountOfInk;
	}
	public int getAmountOfInk() {
		return amountOfInk;
	}
	
	@Override
	public boolean print() {
		if(amountOfInk == 0) {
			System.out.println("잉크가 부족합니다.");
			System.out.println("제조사 : " + super.getManufacturer());
			System.out.println("모델명 : " + super.getModelName());
			System.out.println("잉크젯프린터 >> 인쇄용지 : " + numberOfPaper + " 출력 매수 : " + numberOfPrinted + " 토너 잔량 : " + amountOfInk);
			return false;
		}
		else {
			System.out.println("잉크젯 프린터 출력");
			System.out.println("제조사 : " + super.getManufacturer());
			System.out.println("모델명 : " + super.getModelName());
			System.out.println("잉크젯프린터 >> 인쇄용지 : " + numberOfPaper + " 출력 매수 : " + numberOfPrinted + " 토너 잔량 : " + amountOfInk);
			numberOfPaper--;
			numberOfPrinted++;
			amountOfInk -= 5;
			return true;
		}
	}
}
