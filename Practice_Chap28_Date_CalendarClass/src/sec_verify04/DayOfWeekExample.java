package sec_verify04;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 yyyy/MM/dd 의 형태로 입력해주세요. (예 : 2016/01/01)");
		
		while(true) {
		try {
		System.out.print(">> ");
		String input = "";
		input = scanner.nextLine();
		
		String[] inputcon = input.split("/");
		
		cal.set(Integer.parseInt(inputcon[0]), Integer.parseInt(inputcon[1])-1, Integer.parseInt(inputcon[2]));
		
		if(Integer.parseInt(inputcon[1])-1 > 12 || Integer.parseInt(inputcon[2]) > 31) {
			throw new Exception();
		}
		else {
			System.out.println("입력하신 날짜는 " + days[cal.get(Calendar.DAY_OF_WEEK)-1] + "입니다.");
		}
		scanner.close();
		break;
		} catch (Exception e) {
			System.out.println("예외 발생 -> 날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력 예 : 2016/01/01)");
		}
	}
	}
}
