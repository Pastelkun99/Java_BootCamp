package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		Fruit<String, Integer> f1 = FruitBasket.basketing("사과", 1500);
		String apple = f1.getK();
		int price1 = f1.getV();
		System.out.println("과일명 : " + apple);
		System.out.println("가격 : " + price1);
		
		System.out.println();
		Fruit<String, Integer> f2 = FruitBasket.basketing("귤", 700);
		String orange = f2.getK();
		int price2 = f2.getV();
		System.out.println("과일명 : " + orange);
		System.out.println("가격 : " + price2);
		
		System.out.println();
		Fruit<String, Integer> f3 = FruitBasket.basketing("배", 3700);
		String pear = f3.getK();
		int price3 = f3.getV();
		System.out.println("과일명 : " + pear);
		System.out.println("가격 : " + price3);
		
	}
}
