package sec01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//DATE클래스는 Time-stamp기능으로 많이 사용한다.
		Date now = new Date();	//현재 시스템의 날짜와 시간을 구함
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// KST - 한국 표준시
		
		//Date클래스를 통해 인스턴스 생성후 SimpleDateformat클래스의 format()를
		//이용해서 원하는 형태로 출력할 수 있다.
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
