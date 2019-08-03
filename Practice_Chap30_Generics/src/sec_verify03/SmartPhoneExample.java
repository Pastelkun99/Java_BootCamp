package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone<String, String, Double> sp1 = new SmartPhone<>();
		sp1.setCompany("Samsung");
		sp1.setModel("갤럭시5");
		sp1.setInch(5.5);
		System.out.println("타입 파라미터에 <String, String, Double>로 객체 생성 후 저장값 불러오기");
		System.out.println("회사 : " + sp1.getCompany());
		System.out.println("모델 : " + sp1.getModel());
		System.out.println("인치 : " + sp1.getInch());
		System.out.println();
		
		SmartPhone<String, String, String> sp2 = new SmartPhone<>();
		sp2.setCompany("LG전자");
		sp2.setModel("V20");
		sp2.setInch("6.0");
		System.out.println("타입 파라미터에 <String, String, String>로 객체 생성 후 저장값 불러오기");
		System.out.println("회사 : " + sp2.getCompany());
		System.out.println("모델 : " + sp2.getModel());
		System.out.println("인치 : " + sp2.getInch());
	}
}
