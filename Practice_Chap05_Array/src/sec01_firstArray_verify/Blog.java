package sec01_firstArray_verify;

public class Blog {

	public static void main(String[] args) {
		
		String[][] cabinet = new String[2][2];
		
		cabinet[0][0] = "곰인형";
		cabinet[0][1] = "손목시계";
		
		cabinet[1][0] = "감자칩";
		cabinet[1][1] = "콜라";
		
		System.out.println("첫 번째 서랍장 첫 번째 칸막이에 든 것 : " + cabinet[0][0]);
		System.out.println("첫 번째 서랍장 두 번째 칸막이에 든 것 : " + cabinet[0][1]);
		
		System.out.println("두 번째 서랍장 첫 번째 칸막이에 든 것 : " + cabinet[1][0]);
		System.out.println("두 번째 서랍장 두 번째 칸막이에 든 것 : " + cabinet[1][1]);
		
	}
}
