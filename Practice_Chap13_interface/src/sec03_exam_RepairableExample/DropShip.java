package sec03_exam_RepairableExample;

public class DropShip extends AirUnit implements Repairable {

	//static int hitPoint; <- ������ �ٿ�

	//������
	public DropShip() {
		super(125);
		System.out.println(this.toString() + "�� HP�� " + this.MAX_HP + "�Դϴ�. ��~!");
		super.hitPoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "DropShip";
	}
	
	//�Ű����� Ÿ������ Repairble �������̽��� ���Դ�. �� �ǹ̴� �����ΰ�?
	
	@Override
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
