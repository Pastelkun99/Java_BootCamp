package sec_verify02;

import java.util.Calendar;

public class FirstDateExample {

	public static void main(String[] args) {
		
		   
		   Calendar now = Calendar.getInstance();
		   printCalendar("���� ", now);

		   Calendar firstDate = Calendar.getInstance();
		   firstDate.clear();
		   firstDate.set(2012, 11, 25); // 2012�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ����
		   firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8��
		   firstDate.set(Calendar.MINUTE, 30); // 30��
		   printCalendar("ó�� ����Ʈ�� ���� ", firstDate);
	}
	
	public static void printCalendar(String msg, Calendar cal) {
		
		final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"}; 
		String ampm = "";
		
		if(cal.get(Calendar.HOUR_OF_DAY) >0 && cal.get(Calendar.HOUR_OF_DAY) <13) {
			ampm = "����";
		}
		else {
			ampm = "����";
		}
		
		System.out.println(msg+cal.get(Calendar.YEAR)+"/"+
                 (cal.get(Calendar.MONTH)+1)+"/"+
                 cal.get(Calendar.DATE)+"/ "+
                 DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]+"����"+
                 " ("+cal.get(Calendar.HOUR_OF_DAY)+"��) /"+ ampm + 
                 cal.get(Calendar.HOUR)+"�� "+
                 cal.get(Calendar.MINUTE)+"�� "+
                 cal.get(Calendar.SECOND)+"�� "+
                 cal.get(Calendar.MILLISECOND)+"�и���");

	}
}
