package sec_verify03;

public class Car {

	String company = "Çö´ëÀÚµ¿Â÷";
	String model;
	String color;
	int maxSpeed;

	public Car() {
		this("ÀÚ°¡¿ë", "»¡°­", 200);
	}

	public Car(String model) {
		this(model, "»¡°­", 200);
	}

	public Car(String model, String color) {
		this(model, "»¡°­", 200);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
