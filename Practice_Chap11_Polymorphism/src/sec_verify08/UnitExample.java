package sec_verify08;

public class UnitExample {

	public static void main(String[] args) {
		Unit[] units = new Unit[5];
		units[0] = new AirForce("��1 ���������");
		units[1] = new AirForce("�� 38 ������������");
		units[2] = new Navy("���� ��������");
		units[3] = new Army("��ȣ�δ�");
		units[4] = new Army("������ǳ�δ�");

		for (int i = 0; i < units.length; i++) {
			units[i].attack();

			if (units[i] instanceof Army) {
				Army army = (Army) units[i];
				army.tank();
				System.out.println();
			} else if (units[i] instanceof Navy) {
				Navy navy = (Navy) units[i];
				navy.incleus();
				System.out.println();
			} else {
				AirForce airforce = (AirForce) units[i];
				airforce.bombing();
				System.out.println();
			}
		}
	}
}
