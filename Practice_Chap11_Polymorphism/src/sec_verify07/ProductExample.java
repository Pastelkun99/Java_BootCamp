package sec_verify07;

public class ProductExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Computer());
		
		b.summary();
		
	}

}
