package sec_verify01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoodMorningExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("������ kk�� mm���Դϴ�.");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		if(now.getHours() >= 4 && now.getHours() < 12) {
			System.out.println("�����̳׿�!! �¸��");
		}
		else if (now.getHours() < 18 && now.getHours() >= 12){
			System.out.println("���ĳ׿�! �� �����ʹ�");
		}
		else if (now.getHours() < 22 && now.getHours() >= 18) {
			System.out.println("�����̳׿�! �� �̺��");
		}
		else {
			System.out.println("���̳׿�! ���� �ڿ�");
		}
	}
}
