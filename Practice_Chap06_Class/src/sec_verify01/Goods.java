package sec_verify01;

public class Goods {

	String name = "Nikon";
	int price = 400000;
	int numberofStock = 30;
	int sold = 50;
	
	@Override
	public String toString() {
		return "상품 이름 : " + this.name +
				"\n상품 가격 : " + this.price + 
				"\n재고 수량 : " + this.numberofStock +
				"\n팔린 수량 : " + this.sold;
	}
	
}
