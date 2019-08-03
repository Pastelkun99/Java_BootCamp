package Sec05_exam_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name(); // 요일의 이름을 String으로 반환
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal(); //열거 객체 순번 출력(0번부터 시작)
		System.out.println(ordinal);
		
		//compareTo() 메소드(열거객체 순번 비교)
		Week day1 = Week.MONDAY; //day1 = 0
		Week day2 = Week.WEDNESDAY; //day2 = 2
		int result1 = day1.compareTo(day2); // 0-2 = -2
		int result2 = day2.compareTo(day1); // 2-0 = 2
		System.out.println("result1");
		System.out.println("result2");
		
		//valueOf() 메소드
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말, 주일이군요");
		}
		else {
			System.out.println("평일 이군요");
		}

		//values() 메소드
		Week[] days = Week.values();
		for(int i = 0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		//향상된 for 문
		for(Week day : days) {
			System.out.println(day.hashCode());
		}
	}

}
