package sec08_verify;

public class ShipExample {

	public static void main(String[] args) {
		
		Ship s1 = new Boat("�߽� ��Ʈ");
		Ship s2 = new Cruise("���� ����ȭ");
		
		ShipUtil.search(s1);
		ShipUtil.search(s2);

		System.out.println(s1.getClass().getSimpleName()+" �̸� : "+s1.name+", �ο� : "+s1.move()+", ���� : "+s1.carry());
		System.out.println(s2.getClass().getSimpleName()+" �̸� : "+s2.name+", �ο� : "+s2.move()+", ���� : "+s2.carry());
	}

}
