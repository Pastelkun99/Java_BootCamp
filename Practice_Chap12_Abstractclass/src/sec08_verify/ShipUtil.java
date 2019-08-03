package sec08_verify;

public class ShipUtil {

	static void search(Ship s) {
		System.out.println(s.getClass().getSimpleName() + "가 나를 수 있는 인원 : " + s.move());
		System.out.println(s.getClass().getSimpleName() + "가 나를 수 있는 무기 : " + s.carry());
	}
}
