package sec04_verify;

public abstract class Printer {

	static int USB;
	static int PARALLEL;
	private String modelName;
	private String manufacturer;
	private int type;
	protected int numberOfPrinted;
	protected int numberOfPaper;
	
	public Printer(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.numberOfPaper = numberOfPaper;
		this.numberOfPrinted = numberOfPrinted;
	}

	public int getNumberOfPaper() {
		return numberOfPaper;
	}

	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}

	public static int getUSB() {
		return USB;
	}

	public static int getPARALLEL() {
		return PARALLEL;
	}

	public String getModelName() {
		return modelName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getType() {
		return type;
	}

	public int getNumberOfPrinted() {
		return numberOfPrinted;
	}
	
	abstract public boolean print();
	
}
