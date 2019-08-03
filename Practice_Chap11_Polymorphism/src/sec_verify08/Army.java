package sec_verify08;

public class Army extends Unit {

	public Army(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 지상 공격");
	}
	
	public void tank() {
		System.out.println(super.getName() + " >> 탱크 공격");
	}
}
