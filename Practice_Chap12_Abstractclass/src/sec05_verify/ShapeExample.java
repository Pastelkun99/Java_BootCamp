package sec05_verify;

public class ShapeExample {

	public static void main(String[] args) {

		Shape[] arr = { new Circle(5.0), new Rect(3, 4), new Circle(1) };
		double sum = 0;
		
		sum = sumArea(arr);

		System.out.println("모든 도형의 넓이의 합 : " + sum);
	}

	static double sumArea(Shape[] arr) {
		
		double result = 0;
		
		for(int i = 0; i<arr.length; i++) {
			result += arr[i].calcArea();
		}
		
		return result;
	}

}