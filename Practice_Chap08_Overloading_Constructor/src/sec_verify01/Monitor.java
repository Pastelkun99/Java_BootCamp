package sec_verify01;

public class Monitor {

	String company;
	int inch;
	int price;

	public Monitor() {
		this("LG", 23, 500000);
	}

	public Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
}
