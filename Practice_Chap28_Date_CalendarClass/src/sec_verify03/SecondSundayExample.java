package sec_verify03;

import java.util.Calendar;

public class SecondSundayExample {

	public static void main(String[] args) {
		  
		Calendar date = Calendar.getInstance();
		
		date.set(2016, 0, 10);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 35);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 35);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 35);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 35);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 28);
		System.out.println(toString(date));
		   
	}

	public static String toString(Calendar date) {
		
		String[] month = {"", "일", "월", "화", "수", "목", "금", "토"};
		String[] week = {"", "1번째", "2번쩨", "3번째", "4번째", "5번째"};
		
		return date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH)+1) + "-" + date.get(Calendar.DATE) + "은 "
				+ week[date.get(Calendar.DAY_OF_WEEK_IN_MONTH)] + " " + month[date.get(Calendar.DAY_OF_WEEK)] + "요일입니다.";
	}
}
