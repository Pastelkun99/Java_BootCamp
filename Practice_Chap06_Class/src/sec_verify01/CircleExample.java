package sec_verify01;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle pizza;		 		
		pizza = new Circle();
		pizza.radius = 10;		
		pizza.name = "�ڹ� ����"; 	
		double area1 = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area1);
		
		Circle donut;
		donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹ� ����";
		double area2 = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area2);

	}

}
