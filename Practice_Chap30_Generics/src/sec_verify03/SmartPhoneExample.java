package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone<String, String, Double> sp1 = new SmartPhone<>();
		sp1.setCompany("Samsung");
		sp1.setModel("������5");
		sp1.setInch(5.5);
		System.out.println("Ÿ�� �Ķ���Ϳ� <String, String, Double>�� ��ü ���� �� ���尪 �ҷ�����");
		System.out.println("ȸ�� : " + sp1.getCompany());
		System.out.println("�� : " + sp1.getModel());
		System.out.println("��ġ : " + sp1.getInch());
		System.out.println();
		
		SmartPhone<String, String, String> sp2 = new SmartPhone<>();
		sp2.setCompany("LG����");
		sp2.setModel("V20");
		sp2.setInch("6.0");
		System.out.println("Ÿ�� �Ķ���Ϳ� <String, String, String>�� ��ü ���� �� ���尪 �ҷ�����");
		System.out.println("ȸ�� : " + sp2.getCompany());
		System.out.println("�� : " + sp2.getModel());
		System.out.println("��ġ : " + sp2.getInch());
	}
}
