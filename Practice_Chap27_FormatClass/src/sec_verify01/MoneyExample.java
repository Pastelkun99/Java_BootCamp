package sec_verify01;

import java.text.DecimalFormat;

public class MoneyExample {

	public static void main(String[] args) {

		String data = "123,456,789.5";
		
		String[] datac1 = data.split(",");
		
		String c2 = "";
		for(int i = 0; i<datac1.length; i++) {
			c2 += datac1[i];
		}
		
		System.out.println("data : " + c2);
		double c3 = Double.parseDouble(c2);
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println("반올림 결과 : " + df.format(c3));
		
		double c4 = Double.parseDouble(df.format(c3));
		df = new DecimalFormat("#,####.#");
		System.out.println("만단위 , 추가 : " + df.format(c4));
		
	}

}
