package sec02_verify;

public abstract class Phone {

	String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}
