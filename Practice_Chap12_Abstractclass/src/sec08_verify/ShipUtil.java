package sec08_verify;

public class ShipUtil {

	static void search(Ship s) {
		System.out.println(s.getClass().getSimpleName() + "�� ���� �� �ִ� �ο� : " + s.move());
		System.out.println(s.getClass().getSimpleName() + "�� ���� �� �ִ� ���� : " + s.carry());
	}
}
