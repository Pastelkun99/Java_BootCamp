package sec02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		//��� TIMEZONE�� ID���� ��´�.
		String[] availavleIDs = TimeZone.getAvailableIDs();
		
		for(String id : availavleIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Eroupe/Paris");
		Calendar now = Calendar.getInstance(tz);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "�� " + month + "�� " + day + "�� " + hour + "�� " + minute + "�� " + second + "��");
		System.out.println(month);
	}
}
