package sec05_exam_instance_copy;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car(c1); //c1�� ���纻 c2�� �����Ѵ�.
		
		c2.door = 100; 			//c1�� �ν��Ͻ� ���� door�� ���� �����Ѵ�.
		c2.color = "�����";
		
		Car c3 = new Car(c1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
