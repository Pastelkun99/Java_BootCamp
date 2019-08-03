package sec_verify06;


public class PriorityThreadExample {

	public static void main(String[] args) {
		
		PriorityThread p1 = new PriorityThread("Power");
		PriorityThread p2 = new PriorityThread("Fire");
		PriorityThread p3 = new PriorityThread("Water");
		
		p1.setPriority(1);
		p2.setPriority(10);
		p3.setPriority(5);
		
		p1.start();
		p2.start();
		p3.start();
	}
}
