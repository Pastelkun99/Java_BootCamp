package sec01_verify;

public class Exercise01 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = (++x + y--);
		
		System.out.println("X를 전위증가하고 Y를 후위감소를 한 결과를 z에 대입한 결과 값 : " +  z);
		
		System.out.println(z);
	}

}
