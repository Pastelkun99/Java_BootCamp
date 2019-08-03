package sec03_multy_Catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		try {
			//무슨예외가 발생할 수 있나?
			String data1 = args[0];
			String data2 = args[1];
			//여긴 무슨예외가 발생할 수 있나?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + " = " + result);
		}
		//멀티 캐치(JDK1.7부터 등장)
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행매개값이 부족하거나 숫자로 변환할 수 없음." + e.toString());
			System.out.println("프로그램을 정상종료합니다.");
		}
		catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생했음.");
			System.out.println("프로그램을 정상종료합니다.");
		}
		finally {
			System.out.println("다시 실행하세요!");
		}
	}
}
