package sec_verify07;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	Product[] item = new Product[10];

	int i = 0;

	public void buy(Product p) {
		if (this.money < p.price) {
			System.out.println(p + "는 잔액이 부족하여 살 수 없습니다.");
			this.money = 0;
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		this.item[i++] = p;
		System.out.println(p + "를 구입하셨습니다.");
	}

	public void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;

			sum += this.item[i].price;

			if (i == 2)
				itemList += this.item[i];
			else
				itemList += this.item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}

}
