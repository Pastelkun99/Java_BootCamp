package sec_verify01;

public class Goods {

	String name = "Nikon";
	int price = 400000;
	int numberofStock = 30;
	int sold = 50;
	
	@Override
	public String toString() {
		return "��ǰ �̸� : " + this.name +
				"\n��ǰ ���� : " + this.price + 
				"\n��� ���� : " + this.numberofStock +
				"\n�ȸ� ���� : " + this.sold;
	}
	
}
