package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		Fruit<String, Integer> f1 = FruitBasket.basketing("���", 1500);
		String apple = f1.getK();
		int price1 = f1.getV();
		System.out.println("���ϸ� : " + apple);
		System.out.println("���� : " + price1);
		
		System.out.println();
		Fruit<String, Integer> f2 = FruitBasket.basketing("��", 700);
		String orange = f2.getK();
		int price2 = f2.getV();
		System.out.println("���ϸ� : " + orange);
		System.out.println("���� : " + price2);
		
		System.out.println();
		Fruit<String, Integer> f3 = FruitBasket.basketing("��", 3700);
		String pear = f3.getK();
		int price3 = f3.getV();
		System.out.println("���ϸ� : " + pear);
		System.out.println("���� : " + price3);
		
	}
}
