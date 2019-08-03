package sec03_exam_Contsructor;

public class CarExample {

	public static void main(String[] args) {
		
		//차를 주문해서 자기가 직접 색깔도 바르고, 기어도 만들고, 문도 4개를 만드는 격.
		
		Car c1 = new Car(); //car 인스턴스 생성
				
		 	/*c1.color = "white";
		 	c1.gearType = "auto";
		 	c1.door = 4;*/
		
		//차를 주문할 때 색상, 기어, 문 갯수를 지정해주는 형태
		
		Car c2 = new Car("blue", "auto", 8);
		
		//toString메서드가 호출됨.
		System.out.println(c1);
		System.out.println(c2.toString());

	}

}
