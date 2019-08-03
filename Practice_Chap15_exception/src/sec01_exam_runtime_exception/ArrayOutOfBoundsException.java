package sec01_exam_runtime_exception;

public class ArrayOutOfBoundsException {

	public static void main(String[] args) {

		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
		}
		else {
			//실행 매개값이 없으면 ArrayOutOfBoundsException 발생
			System.out.println("실행방법");
			System.out.println("Java ArrayOutOfBoundsException");
			System.out.println("값 1 값 2");
		}
	}

}
