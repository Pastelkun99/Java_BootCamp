package sec_verify01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoodMorningExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("지금은 kk시 mm분입니다.");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		if(now.getHours() >= 4 && now.getHours() < 12) {
			System.out.println("오전이네요!! 굿모닝");
		}
		else if (now.getHours() < 18 && now.getHours() >= 12){
			System.out.println("오후네요! 굿 애프터눈");
		}
		else if (now.getHours() < 22 && now.getHours() >= 18) {
			System.out.println("저녁이네요! 굿 이브닝");
		}
		else {
			System.out.println("밤이네요! 빨리 자요");
		}
	}
}
