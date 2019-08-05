package sec_verify08;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> ÀÌ·ú");
		System.out.println(this.getName() + " >> °øÁß °ø°Ý");
	}

	public void bombing() {
		System.out.println(this.getName() + " >> Æø°Ý");
	}

}
