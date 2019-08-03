package sec05_verify;

public class ShapeExample {

	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
		double sum[] = new double[arr.length];
		
		sum = sumArea(arr);
		
		for(int i = 0; i<arr.length; i++) {	
			if(i == 1) {
				System.out.println("Rect 면적의 합 : " + sum[i]);
			}
			else {
				System.out.println("Circle 면적의 합 : " + sum[i]);
			}
		}
	}
	
	static double[] sumArea(Shape[] arr) {
		
		double sum[] = new double[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			sum[i] = arr[i].calcArea();
		}
		return sum;
	}
	
}