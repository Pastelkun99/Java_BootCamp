package sec08_verify;

public class Boat extends Ship {

	public Boat(String name) {
		super.name = name;
	}
	
	@Override
	public int move() {
		return 6;
	}
	
	@Override
	public int carry() {
		return 0;
	}
	
	public String name() {
		return name;
	}
}
