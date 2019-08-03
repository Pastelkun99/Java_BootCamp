package sec_verify04;

public class RandomGraphExample {

	
	public static String Printgraph(char ch, int value) {
		
		int[] arr = new int[value];
		
		for(int i =0; i<100; i++) {
			int randomnum = (int)(Math.random()*value);
			arr[randomnum]++;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i + "ÀÇ °¹¼ö : ");
			for(int j = 0; j <arr[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(" " + arr[i]);
		}
		return "";
		
	}
	public static void main(String[] args) {
		Printgraph('#', 10);
	}

}
