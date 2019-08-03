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
		
		String[] month = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		String[] week = {"", "1��°", "2����", "3��°", "4��°", "5��°"};
		
		return date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH)+1) + "-" + date.get(Calendar.DATE) + "�� "
				+ week[date.get(Calendar.DAY_OF_WEEK_IN_MONTH)] + " " + month[date.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.";
	}
}
