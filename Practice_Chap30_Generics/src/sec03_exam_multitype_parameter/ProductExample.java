package sec03_exam_multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		// Product<Tv, String> product1 = new Product<Tv, String>();  // JDK 1.6����
		// ��ƼŸ�� �Ķ���͵� �Ʒ��� ���� �����ϴ� (�Ķ������ ������ ������ ����.)
		
		Product<Tv, String> pro1 = new Product<>();		//JDK 1.7����
		
		pro1.setT(new Tv(2016, 06));
		pro1.setM("LG OLED ����Ʈ TV");
		
		Tv tv = pro1.getT();
		String str1 = pro1.getM();
		System.out.println("�� Ƽ��� " + tv.getYear() + "�� " + tv.getMonth() + "�� ��õ� " + str1 + "�̴�.");
		System.out.println();
		
		Product<Car, String> pro2 = new Product<>();
		pro2.setT(new Car("�Ｚ", 2010, 05));
		pro2.setM("�� SM5 ����");
		
		Car car = pro2.getT();
		String str2 = pro2.getM();
		
		//System.out.println(str1);
		System.out.println("�� �ָ��� " + car.getYear() + "�� " + car.getMonth() + "�� ��õ� " + car.getBrand() + "��"
							+ str2 + "�̴�.");
	}
}
