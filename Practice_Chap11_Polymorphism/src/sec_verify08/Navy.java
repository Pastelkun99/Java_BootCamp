package sec_verify08;

public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> ��� �߻�");
		System.out.println(this.getName() + " >> ���� ���");
	}

	public void incleus() {
		System.out.println(this.getName() + " >> ����� �⵿");
	}

}
