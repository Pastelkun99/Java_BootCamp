package sec_verify04;

public class RandomGraphExample02 {

	public static String printGraph(char ch, int value) {
		
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i = 0; i<number.length; i++) {
			int random = (int)(Math.random()*value);
			counter[random]++;
		}
		
		for(int i = 0; i<counter.length; i++) {
			System.out.print(i + "ÀÇ °¹¼ö : ");
			for(int j = 0; j<counter[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(" " + counter[i]);
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		printGraph('#', 10);
		
	}
}
