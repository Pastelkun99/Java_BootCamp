package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
		try {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
			String strNow = sdf.format(now);
			System.out.println("오늘 날짜 및 시간 : " + strNow);
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {}
		
		}
	}
}
