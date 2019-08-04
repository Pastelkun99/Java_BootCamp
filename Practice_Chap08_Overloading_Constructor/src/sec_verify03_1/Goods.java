package sec_verify03_1;

public class Goods {

	String name;
	int price;
	int numberOfStock;
	int sold;

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	@Override
	public String toString() {
		return this.name + "가격 : " + this.price + " 재고 : " + this.numberOfStock + " 판매된 수량 : " + this.sold;
	}
}
