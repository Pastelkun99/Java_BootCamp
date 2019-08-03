package sec08_exam_generic_extends;

public class ChildProductExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product = new ChildProduct<>();
		ChildProduct<Tv, String, String> childproduct = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setMode("캡션 Tv");
		//product.setCompany("삼성"); Product클래스에는 setcompany메서드가 없다.
		
		String pmodel = product.getMode();
		System.out.println(pmodel);
		
		childproduct.setKind(new Tv());
		childproduct.setMode("스마트 TV");
		childproduct.setCompany("LG");
		
		String model = childproduct.getMode();
		String company = childproduct.getCompany();
		
		System.out.println(company + " : " + model);
	}
}
