package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Audio, Integer> p1 = new Product<>();
		p1.setA(new Audio("Sony", "�ֻ�", 4));
		Audio au = p1.getA();
		
		System.out.println("�� ������� " + au.getBrand() + " �������̸�, ������ " + au.getQuality() + 
							"�̸�, " + au.getChannel() + "ä���̴�.");
		
		Product<Monitor, Integer> p2 = new Product<>();
		p2.setA(new Monitor("�Ｚ", 27));
		p2.setM(350000);
		Monitor mo = p2.getA();
		
		System.out.println();
		System.out.println("������� ��");
		System.out.println("�귣�� : " + mo.getCompany());
		System.out.println("��ġ : " + mo.getInch());
		System.out.println("���� : " + p2.getM());
		
		
		
	}
}
