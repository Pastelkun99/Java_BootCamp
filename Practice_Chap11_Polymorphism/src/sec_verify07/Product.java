package sec_verify07;

public class Product {

	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}

	public Product() {
	}
}
