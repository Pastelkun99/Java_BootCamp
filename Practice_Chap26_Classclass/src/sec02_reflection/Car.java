package sec02_reflection;

public class Car {

	private String model;		//인스턴스 멤버변수
	private String owner;
	
	public Car() {}
	
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
