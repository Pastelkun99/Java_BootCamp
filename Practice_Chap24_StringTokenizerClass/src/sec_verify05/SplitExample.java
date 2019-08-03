package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		
		String str = "pastelkun,�Ľ��ڱ�,javadaisuki";
		
		String[] result = str.split(",");
		
		System.out.println("String�� split()�� �̿��� ���");
		for(String str2 : result) {
			System.out.println(str2);
		}
		
		
		System.out.println();
		System.out.println("StringTokenizer�� �̿��� ���");
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		while(stn.hasMoreTokens()) {
			String con = stn.nextToken();
			System.out.println(con);
		}
	}
}
