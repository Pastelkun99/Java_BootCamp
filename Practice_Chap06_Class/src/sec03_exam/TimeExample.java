package sec03_exam;

public class TimeExample {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//Time t2 = new Time();
		
		//setter 메서드 이용
		t1.setHour(12);
		t1.setMinute(48);
		t1.setSecond(59);
		System.out.println(t1);
		
		/*Setter 메서드 이용
		t1.setHour(12);
		t1.setMinute(48);
		t1.setSecond(59);
		System.out.println(t1);*/
		
		/*Object클래스의 toString()메서드를 호출함.
		System.out.println(t1.toString());
		System.out.println(t2);*/

	}

}
