package sec03_exam_Contsructor;

public class Car {
	
	String color;			//색상
	String gearType;		//변속기 종류 - auto(자동), manual(수동)
	int door;				//문의 개수
	
	//생성자
	//아무런 생성자가 선언되어있지 않다면, 컴파일러가 기본생성자를 줌.
	
	public Car() {
		this("white", "auto", 4);
		System.out.println("기본생성자 호출");
	}
	//매개변수가 있는 생성자
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("매개변수가 있는 생성자 호출");
	}
	
	//어노테이션 = annotation : 컴파일러에게 강하게 체크를 하라는 뜻/
	//내가 재정의를 했으니 맞는지 봐달라는 것
	@Override
	public String toString() {
		String str = "색깔=" + this.color + ", 기어타입=" + this.gearType+ " 문 갯수 = " + this.door;
		return str;
		}
	}

