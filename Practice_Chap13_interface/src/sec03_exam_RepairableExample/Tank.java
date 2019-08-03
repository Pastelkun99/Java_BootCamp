package sec03_exam_RepairableExample;

public class Tank extends GroundUnit implements Repairable {

	//static int hitPoint;

	//������
	public Tank() {
		super(150);
		System.out.println(this.toString() + "�� HP�� " + this.MAX_HP + "�Դϴ�. ��~!");
		super.hitPoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
	
	
	@Override // �Ű����� ������ Product p �� ���÷�����. // tank, 100
	public void DamageUnit(Repairable r, int Damage) {
		//Ÿ�� üũ�ϴ� �κ�
		if(r instanceof Unit) {
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "�� " + Damage + " ��ŭ �������� �Ծ����ϴ�!");
			System.out.println(unit.toString() + "�� ���� HP�� " + (unit.MAX_HP - Damage) + "�Դϴ�!");
			System.out.println(unit.toString() + "�� ������ �ʿ��մϴ� ��~!");
			unit.hitPoint -= Damage; // ü�°���
		}
		
	}
}
