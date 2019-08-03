package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		
		String str = "pastelkun,파스텔군,javadaisuki";
		
		String[] result = str.split(",");
		
		System.out.println("String의 split()를 이용한 방법");
		for(String str2 : result) {
			System.out.println(str2);
		}
		
		
		System.out.println();
		System.out.println("StringTokenizer를 이용한 방법");
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		while(stn.hasMoreTokens()) {
			String con = stn.nextToken();
			System.out.println(con);
		}
	}
}
