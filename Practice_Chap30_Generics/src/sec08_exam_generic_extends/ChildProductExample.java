package sec08_exam_generic_extends;

public class ChildProductExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product = new ChildProduct<>();
		ChildProduct<Tv, String, String> childproduct = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setMode("ĸ�� Tv");
		//product.setCompany("�Ｚ"); ProductŬ�������� setcompany�޼��尡 ����.
		
		String pmodel = product.getMode();
		System.out.println(pmodel);
		
		childproduct.setKind(new Tv());
		childproduct.setMode("����Ʈ TV");
		childproduct.setCompany("LG");
		
		String model = childproduct.getMode();
		String company = childproduct.getCompany();
		
		System.out.println(company + " : " + model);
	}
}
