package sec_verify04;

public class MainArgumentExample {

	public static void main(String[] args) {
		
		String inja = "나는=김지훈&ID=perpear&국어점수=90&수학점수=98&자바점수=100";
		
		String[] converted = inja.split("=|&");
		
		for(int i = 0; i<converted.length; i+=2) {
			System.out.println(converted[i] + " " + converted[i+1]);
		}
			
	}
}
