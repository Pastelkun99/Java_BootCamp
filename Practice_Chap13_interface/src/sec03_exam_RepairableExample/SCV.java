package sec03_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable {

	//static int hitPoint;

	//������
	public SCV() {
		super(60);
		System.out.println(this.toString() + "�� HP�� " + this.MAX_HP + "�Դϴ�. ��~!");
		super.hitPoint = this.MAX_HP;
	}
	
	//Repairable �������̽��� ������ Ŭ������ �Ű������� ���� ���� ������ �ָ�
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count = 0;
			//Unit�� Ÿ���� �´ٸ� �ڼ�Ŭ����(Tank, DropShip�� Unit Ÿ������ ��������ȯ)
			Unit u = (Unit)r;
			
			//System.out.println("���� ü�� : " + u.MAX_HP); <- ������
			System.out.println("���� ü�� : " + u.hitPoint);
			
			while(u.hitPoint != u.MAX_HP) {
				// Unit�� HP�� ������Ų��.
				u.hitPoint++;
				count++;
			}
			System.out.println(u.toString() + " �� HP�� " + count + "��ŭ ������ �������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	
	@Override // �Ű����� ������ Product p �� ���÷�����. // tank, 100
	public void DamageUnit(Repairable r, int Damage) {
		//Ÿ�� üũ�ϴ� �κ�
		if(r instanceof Unit) {
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "�� " + Damage + " ��ŭ �������� �Ծ����ϴ�!");
			System.out.println(unit.toString() + "�� ���� HP�� " + (unit.MAX_HP - Damage) + "�Դϴ�!");
			System.out.println(unit.toString() + "�� ������ �ʿ��մϴ� ��~!");
			super.hitPoint -= Damage; // ü�°���
		}
		
	}
}
