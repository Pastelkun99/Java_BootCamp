package sec_verify05;

public class FruitBasket {

	static int igf = 0;
	
	
	public static<K, V> Fruit<K, V> basketing(K k, V v) {
		
		if(igf == 0) {
			Fruit<K, V> fruit = new Fruit<K, V>();
			System.out.println("Fruit �ٱ��Ͽ� ������ ���׿�.");
			fruit.setK(k);
			fruit.setV(v);
			igf++;
			return fruit;
			
		}
		else {
			System.out.println("Fruit �ٱ��Ͽ� �� ������ ���׿�.");
			Fruit<K, V> fruit = new Fruit<K, V>();
			fruit.setK(k);
			fruit.setV(v);
			return fruit;
		}
	}
	
}
