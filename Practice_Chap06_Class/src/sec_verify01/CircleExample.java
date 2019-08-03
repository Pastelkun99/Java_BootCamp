package sec_verify01;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle pizza;		 		
		pizza = new Circle();
		pizza.radius = 10;		
		pizza.name = "자바 피자"; 	
		double area1 = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area1);
		
		Circle donut;
		donut = new Circle();
		donut.radius = 2;
		donut.name = "자바 도넛";
		double area2 = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area2);

	}

}
