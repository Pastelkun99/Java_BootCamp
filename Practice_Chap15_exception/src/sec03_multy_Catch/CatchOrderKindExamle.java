package sec03_multy_Catch;

public class CatchOrderKindExamle {

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
		/*catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
			System.out.println("프로그램을 정상종료합니다.");
		}*/
		//컴파일 예외가 발생하는 이유? - 조상이 먼저와서 얘가 다 잡아감. 나머지는 실행이 안된다.
		//멀티 캐치(JDK1.7부터 등장)
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfException발생");
			System.out.println("실행 매개값이 부족합니다.");
			System.out.println("실행방법 : java CatchByExceptionKindExample num1 num2");
			System.out.println("프로그램을 정상종료합니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
			System.out.println("숫자로 변환할 수 없습니다. 매개변수의 값을 확인하세요!");
			System.out.println("프로그램을 정상 종료합니다.");
		}
		catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
			System.out.println("프로그램을 정상종료합니다.");
		}
		finally {
			System.out.println("다시 실행하세요!");
		}
	}
}
