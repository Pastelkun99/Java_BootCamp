package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {

	public static void main(String[] args) {
		
		Car c1 = new Car("SM5-����",4);
		Car c2 = new Car("SM7-����",4);
		Car c3 = new Car("SM5-����",4);
		
		CarComparator cc = new CarComparator();
		
		int result = Objects.compare(c1, c3, cc);
		int result2 = Objects.compare(c1, c2, cc);
		
		
		if(result == 0) {
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		}
		else {
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");
		}
		
		if(result2 == 0) {
			System.out.println("c1�� c3�� ���� �����Դϴ�.");
		}
		else {
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");
		}
	}
}
