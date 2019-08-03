package sec_verify05;

public class DriverExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		vehicle.run();
		driver.drive(bus);
		driver.drive(taxi);
	}

}
