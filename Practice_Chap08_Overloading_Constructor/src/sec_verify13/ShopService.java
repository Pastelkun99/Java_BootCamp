package sec_verify13;

public class ShopService {

	private static ShopService shop = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return ShopService.shop;
	}
}
