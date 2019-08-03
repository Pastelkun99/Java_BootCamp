package sec08_verify;

public class Cruise extends Ship {

	public Cruise(String name) {
		super.name = name;
	}
	
	@Override
	public int move() {
		return 300;
	}
	
	@Override
	public int carry() {
		return 200;
	}
	
	public String name() {
		return name;
	}
}
