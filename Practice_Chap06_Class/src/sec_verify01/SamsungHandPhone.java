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
			System.out.println("Samsung���� �ƴմϴ�.");
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
			System.out.println("Samsung�� ���� �ƴմϴ�.");
			System.out.println("(Samsung�� : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)");
		}
	}

	public void setcolor(String color) {
		if (color != "white") {
			System.out.println("���ǿ� �ȸ���");
			return;
		}
		this.color = "white";
	}

	public void setrelease(int release) {
		if (release < 2007) {
			System.out.println("����Ʈ���� ���ߵǱ� ���� �����Դϴ�.");
			return;
		}
		this.release = 2013;
	}

	@Override
	public String toString() {
		String str = this.getcompany() + "ȸ���� " + this.color + "������ " + this.model + "���̸�, ������� " + this.release
				+ "���Դϴ�.";
		return str;
	}
}