package sec_verify04;

public class MainArgumentExample {

	public static void main(String[] args) {
		
		String inja = "����=������&ID=perpear&��������=90&��������=98&�ڹ�����=100";
		
		String[] converted = inja.split("=|&");
		
		for(int i = 0; i<converted.length; i+=2) {
			System.out.println(converted[i] + " " + converted[i+1]);
		}
			
	}
}
