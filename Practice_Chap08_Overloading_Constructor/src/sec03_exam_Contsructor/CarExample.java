package sec03_exam_Contsructor;

public class CarExample {

	public static void main(String[] args) {
		
		//���� �ֹ��ؼ� �ڱⰡ ���� ���� �ٸ���, �� �����, ���� 4���� ����� ��.
		
		Car c1 = new Car(); //car �ν��Ͻ� ����
				
		 	/*c1.color = "white";
		 	c1.gearType = "auto";
		 	c1.door = 4;*/
		
		//���� �ֹ��� �� ����, ���, �� ������ �������ִ� ����
		
		Car c2 = new Car("blue", "auto", 8);
		
		//toString�޼��尡 ȣ���.
		System.out.println(c1);
		System.out.println(c2.toString());

	}

}
