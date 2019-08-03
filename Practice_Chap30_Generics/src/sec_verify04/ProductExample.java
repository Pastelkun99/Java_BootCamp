package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Audio, Integer> p1 = new Product<>();
		p1.setA(new Audio("Sony", "최상", 4));
		Audio au = p1.getA();
		
		System.out.println("내 오디오는 " + au.getBrand() + " 제조사이며, 음질은 " + au.getQuality() + 
							"이며, " + au.getChannel() + "채널이다.");
		
		Product<Monitor, Integer> p2 = new Product<>();
		p2.setA(new Monitor("삼성", 27));
		p2.setM(350000);
		Monitor mo = p2.getA();
		
		System.out.println();
		System.out.println("모니터의 상세");
		System.out.println("브랜드 : " + mo.getCompany());
		System.out.println("인치 : " + mo.getInch());
		System.out.println("가격 : " + p2.getM());
		
		
		
	}
}
