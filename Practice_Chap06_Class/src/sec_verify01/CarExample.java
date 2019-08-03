package sec_verify01;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println(car);
		
		car.speedcon();
		
		System.out.println("수정된 속도 : " + car.nowspeed);
		
		
		/*Car car;
		car = new Car();
		System.out.println("제작회사 : "+car.company);
		System.out.println("모델명 : "+car.model);
		System.out.println("색깔 : "+car.color);
		System.out.println("최고속도 : "+car.maxspeed);
		System.out.println("현재속도 : "+car.nowspeed);
		
		car.speedcon();
		
		System.out.println("수정된 속도 : " + car.nowspeed);*/
	}
}
