package sec_verify01;

public class SamsungHandPhoneExample {

	public static void main(String[] args) {
		
		SamsungHandPhone sam = new SamsungHandPhone();
		
		sam.setcompany("Samsung");
		sam.setcompany("LG");
		sam.setmodel("�������̽�");
		sam.setmodel("Galaxy5");
		sam.setcolor("white");
		sam.setrelease(2013);
		
		if(sam.company == null || sam.model == null || sam.color == null || sam.release < 2007) {
			System.out.println("");
		}
		else {
			System.out.println(sam);	
		}
		
		// �ùٸ� �Է°��� �ƴϸ� ��ü�� �� ��������� ���Ե��� �ʵ��� �����մϴ�.
		// �̴� ���α׷��ֿ��� ��ü�� ���� ���� �����Ͽ� �������� �۵��� ������ �� �ְ� �˴ϴ�.
	}

}
