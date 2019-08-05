package sec_verify08;

public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 어뢰 발사");
		System.out.println(this.getName() + " >> 지상 상륙");
	}

	public void incleus() {
		System.out.println(this.getName() + " >> 잠수정 출동");
	}

}
