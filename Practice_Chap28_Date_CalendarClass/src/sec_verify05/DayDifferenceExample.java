package sec_verify05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayDifferenceExample {

	public static void main(String[] args) {

		System.out.println("2016�� 01�� 03�� - 2016�� 02�� 01���� ���� : " + getDayDiff("20160103","20160201") + "��");
		System.out.println("2016�� 01�� 03�� - 2016�� 01�� 03���� ���� : " + getDayDiff("20160103","20160103") + "��");
		System.out.println(" " + getDayDiff("20010103","200103"));
	}

	
	public static long getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		
		try {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		   
			Date beginDate = formatter.parse(yyyymmdd2);
		    Date endDate = formatter.parse(yyyymmdd1);
		    
		    long diff = endDate.getTime() - beginDate.getTime();
		    long diffDays = Math.abs(diff / (24 * 60 * 60 * 1000));
		    
		    return diffDays;
		    
		} catch (Exception e) {
			System.out.print("�Ľ� ���� �߻�");
			return 0;
		}
	}
}
