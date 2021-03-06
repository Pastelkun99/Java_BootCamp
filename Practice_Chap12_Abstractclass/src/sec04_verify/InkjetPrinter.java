package sec04_verify;

public class InkjetPrinter extends Printer {

	static final int amountOfInkToPrint = 5;
	private int amountOfInk;

	public InkjetPrinter(String modelName, String manufacturer, int numberOfPaper, int numberOfPrinted,
			int amountOfInk) {
		super(modelName, manufacturer, numberOfPaper, numberOfPrinted);
		this.amountOfInk = amountOfInk;
	}

	public int getAmountOfInk() {
		return amountOfInk;
	}

	@Override
	public boolean print() {
		if (amountOfInk >= 0) {
			if(numberOfPaper < 0) {
				System.out.println("������ �����ϴ�. ����� �����մϴ�.");
			} else {
			System.out.println("��ũ�� ������ ���");
			System.out.println("������ : " + super.getManufacturer());
			System.out.println("�𵨸� : " + super.getModelName());
			System.out.println("��ũ�������� >> �μ���� : " + numberOfPaper + " ��� �ż� : " + numberOfPrinted + " ��ũ �ܷ� : " + amountOfInk);
			if(amountOfInk == 0) {
				return true;
			}
			numberOfPaper--;
			numberOfPrinted++;
			amountOfInk -= 1;
			return true;
			}
			return true;
		} else {
			System.out.println("��ũ�� �����մϴ�.");
			System.out.println("������ : " + super.getManufacturer());
			System.out.println("�𵨸� : " + super.getModelName());
			System.out.println("��ũ�������� >> �μ���� : " + numberOfPaper + " ��� �ż� : " + numberOfPrinted + " ��ũ �ܷ� : " + amountOfInk);
			numberOfPaper--;
			numberOfPrinted++;
			amountOfInk -= 5;
			return false;
		}
	}
}
