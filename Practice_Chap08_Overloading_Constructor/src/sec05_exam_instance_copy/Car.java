package sec05_exam_instance_copy;

public class Car {
	
	String color;			//색상
	String gearType;		//변속기 종류 - auto(자동), manual(수동)
	int door;				//문의 개수
	
	//생성자
	//생성자가 여러개가 있을 때는 항상 오버로딩의 규칙을 따라야 하는 것에 주의.
	
	public Car() {
		this("white", "auto", 4);
	}
	
	//인스턴스의 복사를 위한 생성자. -- 객체 초기화(Object Initialization)
	public Car(Car c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	public Car(String color) {
		this(color, "auto", 4); //color값을 가지고 매개변수 3개인 생성자 호출
	}
	
	public Car(String color, String gearType) {
		this(color, gearType, 4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	@Override
	public String toString() {
		String str = "color = " + this.color + ", gearType = " + this.gearType + ", door = " + this.door;
		return str;
	}
		}
	

