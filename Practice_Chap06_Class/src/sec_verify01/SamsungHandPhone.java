package sec_verify01;

public class SamsungHandPhone {

	String company;
	String model;
	String color;
	int release;

	public String getcompany() {
		return this.company;
	}

	public String getmodel() {
		return this.model;
	}

	public String getcolor() {
		return this.color;
	}

	public int release() {
		return this.release;
	}

	public void setcompany(String company) {
		if (company != "Samsung") {
			System.out.println("Samsung폰이 아닙니다.");
			return;
		}
		this.company = "Samsung";
	}

	public void setmodel(String model) {
		if (model == "Galaxy3" || model == "Galaxy4" || model == "Galaxy5" || model == "Galaxy6" || model == "Galaxy7"
				|| model == "GalaxyNote") {
			this.model = model;
			return;
		} else {
			System.out.println("Samsung폰 모델이 아닙니다.");
			System.out.println("(Samsung모델 : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)");
		}
	}

	public void setcolor(String color) {
		if (color != "white") {
			System.out.println("조건에 안맞음");
			return;
		}
		this.color = "white";
	}

	public void setrelease(int release) {
		if (release < 2007) {
			System.out.println("스마트폰이 개발되기 이전 연도입니다.");
			return;
		}
		this.release = 2013;
	}

	@Override
	public String toString() {
		String str = this.getcompany() + "회사의 " + this.color + "색상의 " + this.model + "모델이며, 출시일은 " + this.release
				+ "년입니다.";
		return str;
	}
}