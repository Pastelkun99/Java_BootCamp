package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if(c1.model.compareTo(c2.model) < 0) {
			return -1;
		}
		else if((c1.model.compareTo(c2.model)) == 0) {
			return 0;
		}
		else
			return 1;
	}
	
	/*public int compare(Car c2, Car c1) {
		if(c1.door == c2.door) {
			return 0;
		}
		else {
			return -1;
		}
	}*/
}
