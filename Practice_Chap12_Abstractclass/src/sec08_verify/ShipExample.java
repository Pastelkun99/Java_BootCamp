package sec08_verify;

public class ShipExample {

	public static void main(String[] args) {
		
		Ship s1 = new Boat("쌩쌩 보트");
		Ship s2 = new Cruise("전함 무궁화");
		
		ShipUtil.search(s1);
		ShipUtil.search(s2);

		System.out.println(s1.getClass().getSimpleName()+" 이름 : "+s1.name+", 인원 : "+s1.move()+", 무기 : "+s1.carry());
		System.out.println(s2.getClass().getSimpleName()+" 이름 : "+s2.name+", 인원 : "+s2.move()+", 무기 : "+s2.carry());
	}

}
