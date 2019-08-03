package sec03_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable {

	//static int hitPoint;

	//생성자
	public SCV() {
		super(60);
		System.out.println(this.toString() + "의 HP는 " + this.MAX_HP + "입니다. 썰~!");
		super.hitPoint = this.MAX_HP;
	}
	
	//Repairable 인터페이스를 구현한 클래스만 매개변수로 들어올 수가 있음에 주목
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count = 0;
			//Unit의 타입이 맞다면 자손클래스(Tank, DropShip을 Unit 타입으로 강제형변환)
			Unit u = (Unit)r;
			
			//System.out.println("현재 체력 : " + u.MAX_HP); <- 수정됨
			System.out.println("현재 체력 : " + u.hitPoint);
			
			while(u.hitPoint != u.MAX_HP) {
				// Unit의 HP를 증가시킨다.
				u.hitPoint++;
				count++;
			}
			System.out.println(u.toString() + " 의 HP가 " + count + "만큼 수리가 끝났습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	
	@Override // 매개변수 다형성 Product p 를 떠올려보자. // tank, 100
	public void DamageUnit(Repairable r, int Damage) {
		//타입 체크하는 부분
		if(r instanceof Unit) {
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "가 " + Damage + " 만큼 데미지를 입었습니다!");
			System.out.println(unit.toString() + "의 현재 HP는 " + (unit.MAX_HP - Damage) + "입니다!");
			System.out.println(unit.toString() + "의 수리가 필요합니다 썰~!");
			super.hitPoint -= Damage; // 체력감소
		}
		
	}
}
